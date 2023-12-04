package org.Server;

import java.io.*;
import java.net.*;

/**
 * Main class for the multi-threaded server
 */
public class Dispatcher{
    /**
     * Main method for the multi-threaded server, it creates a new Thread every time a request arrives.
     * 
     * @throws IOException Unhandled exception thrown by th eIO operation done on the socket.
     */
    public static void main(String[] args) throws IOException {
        ServerSocket listeningSocket = new ServerSocket(7000);

        while(true){
            Socket connectionSocket = listeningSocket.accept();
            Thread drone = new Thread(new ServerMultithread(connectionSocket));
            System.out.println("Instanciated new drone");
            drone.start();
        }
    }
}
