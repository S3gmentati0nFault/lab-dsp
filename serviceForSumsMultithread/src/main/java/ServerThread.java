import java.io.*;
import java.net.*;
public class ServerThread extends Thread {
        private Socket connectionSocket = null;
        private BufferedReader inFromClient;
        private DataOutputStream outToClient;

        // the constructor argument is an established socket
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
