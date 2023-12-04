package multithread;

import java.io.*;
import java.net.*;

/**
 * Multi-thread implementation of a server.
 */
class MultiServer {
    /**
     * Main method for the server class.
     * @throws Exception Very undescriptive exception, I suppose this one was used to avoid throwing all of the different kinds of exceptions required by the different operations.
     */
    public static void main(String argv[]) throws Exception {
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while(true) {
            Socket connectionSocket = welcomeSocket.accept();

            // thread creation passing the established socket as arg
            ServerThread theThread =
                    new ServerThread(connectionSocket);

            // start of the thread
            theThread.start();
        }
    }
}
