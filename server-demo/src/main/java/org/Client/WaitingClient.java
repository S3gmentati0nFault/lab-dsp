package org.Client;

import java.io.*;
import java.net.*;

class WaitingClient{
    public static void main(String[] args) throws IOException, InterruptedException {
        String sentence = "io sto aspettando, non mi mettere fretta";
        String newSentence;

        Socket waitingClientSocket = new Socket("localhost", 7000);

        BufferedReader serverStream =
                new BufferedReader(new InputStreamReader(waitingClientSocket.getInputStream()));
        DataOutputStream outputStream =
                new DataOutputStream(waitingClientSocket.getOutputStream());

        System.out.println("Client di Sleepy Joe");
        Thread.sleep(20000);
        System.out.println("Riposino finito");
        outputStream.writeBytes(sentence + '\n');
        newSentence = serverStream.readLine();
        System.out.println("OUTPUT DEL SERVER: " + newSentence);
        waitingClientSocket.close();
    }
}