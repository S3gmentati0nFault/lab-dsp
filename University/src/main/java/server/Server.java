package server;

import data.StudentOuterClass;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(6789);
        Socket commSocket;

        while(true){
            commSocket = listener.accept();
            Worker thread = new Worker(commSocket);

            thread.run();
        }
    }
}
