package thread;

import buffer.Buffer;
import client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferWriter extends Thread {
    Socket commSocket;
    final Buffer buffer;

    public BufferWriter(Socket commSocket, Buffer buffer){
        this.commSocket = commSocket;
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try {
            BufferedReader inputStream =
                    new BufferedReader(
                            new InputStreamReader(commSocket.getInputStream()));
            while(true){
                String message = inputStream.readLine();
                if (message.equalsIgnoreCase("%%end%%")){
                    break;
                }
                buffer.put(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
