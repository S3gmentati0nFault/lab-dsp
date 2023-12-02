package main;

import client.Client;
import extra.Colors;
import extra.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Test class for the Chat environment
 */
public class Chat {
    public static void main(String[] args) throws IOException, InterruptedException {
        int clientPort, bufferPort, dimension;
        BufferedReader inputStream =
                new BufferedReader(
                        new InputStreamReader(System.in));

        Logger.interact("Inserire una porta per il client con cui ci si vuole connettere");
        clientPort = Integer.parseInt(inputStream.readLine());
        Logger.interact("Inserire una porta per il buffer locale");
        bufferPort = Integer.parseInt(inputStream.readLine());
        Logger.interact("Inserire una dimensione per il buffer");
        dimension = Integer.parseInt(inputStream.readLine());
        Logger.notice("Starting service at >> " + clientPort + ", " + bufferPort + ", " + dimension);
        startChat(clientPort, bufferPort, dimension);
    }

    public static void startChat(int clientPort, int bufferPort, int dimension)
            throws IOException, InterruptedException {
        Client client =
                new Client(clientPort, dimension, bufferPort);
        client.start();
    }
}
