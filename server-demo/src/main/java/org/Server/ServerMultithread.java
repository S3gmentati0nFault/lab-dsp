package org.Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Actual Thread implementation
 */
public class ServerMultithread implements Runnable{
    private Socket threadSocket;

    private BufferedReader threadInputStream;
    private DataOutputStream outputStream;

    /**
     * Constructor that saves the socket and sets up all of the Stream-related objects.
     * 
     * @param threadSocket Communication socket utilized by the server.
     * @throws IOException Unhandled exception thrown by the IO-related objects.
     */
    public ServerMultithread(Socket threadSocket) throws IOException {
        this.threadSocket = threadSocket;
        outputStream =
                new DataOutputStream(this.threadSocket.getOutputStream());
        threadInputStream =
                new BufferedReader(
                        new InputStreamReader(this.threadSocket.getInputStream()));
    }

    /**
     * Override of the run method associated to the Thread
     */
    @Override
    public void run() {
        String sentence, modSentence;
        System.out.println("Starting drone");
        try {
            sentence = threadInputStream.readLine();
            modSentence = sentence.toUpperCase();
            outputStream.writeBytes(modSentence);
            threadSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
