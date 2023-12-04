package iterative;

import java.io.*;
import java.net.*;

/**
 * Iterative client class.
 */
class Client {
        /**
         * Main client method.
         * @throws Exception Very undescriptive exception, I suppose this one was used to avoid throwing all of the different kinds of exceptions required by the different operations.
         */
    public static void main(String argv[]) throws Exception {
        String sentence;
        String modifiedSentence;

        // input stream initialization (from user keyboard)
        BufferedReader inFromUser =
                new BufferedReader(new InputStreamReader(System.in));

		/* client socket initialization
			localhost: server address
			6789: server service port number */
        Socket clientSocket = new Socket("localhost", 6789);

        // output stream towards socket initialization
        DataOutputStream outToServer =
                new DataOutputStream(clientSocket.getOutputStream());

        // input stream from socket initialization
        BufferedReader inFromServer =
                new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));

        // read a line from the user
        sentence = inFromUser.readLine();

        // send the line to the server
        outToServer.writeBytes(sentence + '\n');

        // read the response from the server
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
    }
}
