package org.server;

import Data.Tickets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  This dispatcher class is a simple multi-threaded server that generates a new Thread for every
 *  request coming from the outside.
 */
public class Dispatcher {
    public static void main(String[] args) throws IOException {
        ServerSocket listeningSocket =
                new ServerSocket(7000);
        Tickets tickets =
                new Tickets();

        while(true){
            Socket connectionSocket = listeningSocket.accept();
            Thread worker =
                    new Thread(
                            new Worker(connectionSocket, tickets));
            worker.start();
        }
    }
}
