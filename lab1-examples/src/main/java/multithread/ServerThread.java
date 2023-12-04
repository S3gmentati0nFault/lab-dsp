package multithread;

import java.io.*;
import java.net.*;

/**
 * Server Thread class for the Multi-threaded server.
 */
public class ServerThread extends Thread {
    private Socket connectionSocket = null;
    private BufferedReader inFromClient;
    private DataOutputStream outToClient;

    /**
     * Constructor for the Thread.
     * @param s The socket is passed to the constructor, the rest of the attributes are built in place.
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
     * Main run statement, which is called after the constructor. It's a capitalization Thread.
     */
    public void run() {
        String clientSentence;
        String capitalizedSentence;
        try {
            clientSentence = inFromClient.readLine();
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);
            connectionSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
