package org.Server;

import java.io.*;
import java.net.*;

/**
 * Main server class.
 */
class Server{
    /**
     * Main method for the iterative server.
     * 
     * @throws Exception Very undescriptive exception, I suppose this one was used to avoid throwing all of the different kinds of exceptions required by the different operations.
     */
    public static void main(String argv[]) throws Exception{
        String clientSentence;
        String capitalizedSentence;

        ServerSocket listeningSocket = new ServerSocket(7000);

        while(true){
            Socket connectionSocket = listeningSocket.accept();
            BufferedReader clientStream =
                    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outputStream =
                    new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = clientStream.readLine();
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outputStream.writeBytes(capitalizedSentence);
            connectionSocket.close();
        }
    }
}