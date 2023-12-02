package thread;

import buffer.Buffer;
import client.Client;
import extra.Logger;

import java.io.IOException;
import java.net.Socket;

/**
 *  The BufferReader class is the reading Thread associated to the Buffer.
 */
public class BufferReader extends Thread{
    private final Buffer buffer;
    private String name;

    /**
     *  Constructor for the BufferReader class.
     *
     *  @param buffer It receives the Buffer currently associated to the Client.
     */
    public BufferReader(Buffer buffer){
        this.buffer = buffer;
        name = null;
    }

    /**
     *  Override of the run method from the Thread class. Basically this method implements a read /
     *  write cycle by reading whenever the buffer is full and writing to it whenever there is
     *  enough space available. The read / write cycle is interrupted whenever one of the users
     *  sends a %%end%% message in the chat.
     */
    @Override
    public void run(){
        while(true){
            String message = null;
            try {
                message = buffer.pop();
                if(name == null){
                    name = message;
                }
                else{
                    if(message.equalsIgnoreCase("%%end%%")){
                        break;
                    }
                    Logger.message(message, name);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        buffer.notify();
        return;
    }
}
