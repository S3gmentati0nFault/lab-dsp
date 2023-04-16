package thread;

import buffer.Buffer;
import client.Client;
import extra.Logger;

import java.io.IOException;
import java.net.Socket;

public class BufferReader extends Thread{
    private final Buffer buffer;
    private String name;

    public BufferReader(Buffer buffer){
        this.buffer = buffer;
        name = null;
    }

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
