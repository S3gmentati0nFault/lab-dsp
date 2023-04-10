package org.Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//public class ServerMultithread extends Thread{
public class ServerMultithread implements Runnable{
    private Socket threadSocket;

    private BufferedReader threadInputStream;
    private DataOutputStream outputStream;

    public ServerMultithread(Socket threadSocket) throws IOException {
        this.threadSocket = threadSocket;
        outputStream =
                new DataOutputStream(this.threadSocket.getOutputStream());
        threadInputStream =
                new BufferedReader(
                        new InputStreamReader(this.threadSocket.getInputStream()));
    }

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
