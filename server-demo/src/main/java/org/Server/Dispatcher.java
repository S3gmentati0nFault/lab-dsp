package org.Server;

import java.io.*;
import java.net.*;

public class Dispatcher{
    public static void main(String[] args) throws IOException {
        ServerSocket listeningSocket = new ServerSocket(7000);

        while(true){
            Socket connectionSocket = listeningSocket.accept();
//            ServerMultithread drone = new ServerMultithread(connectionSocket);
            Thread drone = new Thread(new ServerMultithread(connectionSocket));
            System.out.println("Instanciated new drone");
            drone.start();
        }
    }
}
