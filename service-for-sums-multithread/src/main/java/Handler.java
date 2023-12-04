import java.io.*;
import java.net.*;

/**
 * Main server class for a multi-threaded implementation of the sum client-server architecture
 */
public class Handler {
    /**
     * Main method for the client-server sum architecture
     * 
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
