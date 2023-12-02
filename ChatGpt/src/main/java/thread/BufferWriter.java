package thread;

import buffer.Buffer;
import client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *  The BufferWriter class is the writing Thread in the system.
 */
public class BufferWriter extends Thread {
    Socket commSocket;
    final Buffer buffer;

    /**
     *  Constructor for the BufferWriter class.
     *
     *  @param commSocket This is the socket employed by the Client to communicate with the Buffer
     *  of the other client.
     *  @param buffer The buffer associated to the Client.
     */
    public BufferWriter(Socket commSocket, Buffer buffer){
        this.commSocket = commSocket;
        this.buffer = buffer;
    }

    /**
     *  Override of the run method associated to Thread class. This method implements a read / write
     *  cycle the same way I did for the BufferReader.
     *
     *  @see BufferReader
     */
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
