package buffer;

import client.Client;
import extra.Colors;
import extra.Logger;

public class Buffer {
    private String[] buffer;
    private int dimension, freeSpace, port;
    private Client client;

    public Buffer(int dimension){
        this.dimension = dimension;
        freeSpace = dimension;
        buffer = new String[dimension];
    }

    public Buffer(int dimension, int port){
        this.dimension = dimension;
        freeSpace = dimension;
        buffer = new String[dimension];
        this.port = port;
        client = new Client();
    }

    synchronized public String pop() throws InterruptedException {
        while(isEmpty()){
            wait();
        }
        String lastMessage = buffer[0];
        for(int i = 1; i < dimension - freeSpace; ++i){
            buffer[i - 1] = buffer[i];
        }
        freeSpace++;
        return lastMessage;
    }

    synchronized public void put(String message){
        if(freeSpace > 0){
            buffer[dimension - freeSpace] = message;
            freeSpace--;
            notify();
        }
        else{
            Logger.error("Il buffer é pieno");
        }
    }

    public void iterate(){
        if(isEmpty()){
            Logger.error("Il buffer é vuoto");
        }
        else{
            for(int i = 0; i < dimension - freeSpace; ++i){
                System.out.println(buffer[i]);
            }
        }
    }

    public boolean isEmpty(){
        if(freeSpace == dimension){
            return true;
        }
        return false;
    }

    public void setClient(Client client){
        this.client = client;
    }
}