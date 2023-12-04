import java.io.*;
import java.net.*;

/**
 * Actual Thread implementation.
 */
public class ServerThread extends Thread {
        private Socket connectionSocket = null;
        private BufferedReader inFromClient;
        private DataOutputStream outToClient;

        /**
         * Constructor for the Server Thread.
         * 
         * @param s Communication socket for the server.
         */
        public ServerThread(Socket s) {
            connectionSocket = s;
            try {
                inFromClient =
                        new BufferedReader(
                                new InputStreamReader(connectionSocket.getInputStream()));
                outToClient =
                        new DataOutputStream(connectionSocket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Implementation of the run function for the thread.
         */
        @Override
        public void run() {
            int number1, number2;
            Integer sum;
            try {
                number1 = Integer.parseInt(inFromClient.readLine());
                number2 = Integer.parseInt(inFromClient.readLine());

                sum = number1 + number2;
                outToClient.writeBytes(sum.toString());
                connectionSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
