import java.io.*;
import java.net.*;
public class Handler {
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
