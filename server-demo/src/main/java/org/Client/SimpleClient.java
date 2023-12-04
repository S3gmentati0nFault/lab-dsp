package org.Client;

import java.io.*;
import java.net.*;

/**
 * Simple Client implementation, this client requires for the action and wants it done as soon as possible.
 */
class SimpleClient{
        /**
         * Main method for the class.
         */
    public static void main(String[] argv) throws Exception{
        String sentence = "Ma quanto cazzo ci vuole";
        String modifiedSentence;

        Socket clientSocket = new Socket("localhost", 7000);

        DataOutputStream outputStream =
                new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inputStream =
                new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        outputStream.writeBytes(sentence + '\n');
        modifiedSentence = inputStream.readLine();
        System.out.println("Dati inviati");
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
    }
}