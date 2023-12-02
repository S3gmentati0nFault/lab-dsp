package buffer;

import client.Client;
import extra.Colors;
import extra.Logger;

/**
 *  Buffer class that allows message exchange between the two clients.
 */
public class Buffer {
    private String[] buffer;
    private int dimension, freeSpace, port;
    private Client client;

    /**
     * The class constructor, it uses a default value for the port used to define the client.
     *
     * @param dimension Defines the dimension of the buffer.
     */
    public Buffer(int dimension){
        this.dimension = dimension;
        freeSpace = dimension;
        buffer = new String[dimension];
    }

    /**
     * Another class constructor, it allows the user to define a specific value for the client port.
     *
     * @param dimension Defines the dimension of the buffer.
     * @param port Defines the port associated to the HTTP client.
     */
    public Buffer(int dimension, int port){
        this.dimension = dimension;
        freeSpace = dimension;
        buffer = new String[dimension];
        this.port = port;
        client = new Client();
    }

    /**
     * This function returns the first element inside the Buffer, this process is synchronized
     * because the data structure is shared between a read and a write thread. The Buffer is emptied
     * every time it results to be full.
     * 
     * @throws InterruptedException Generic throw that is not handled, caused by the wait()
     * function.
     * @return The method returns the lastMessage inside the Buffer.
     */
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

    /**
     * This method is synchronized and allows the write thread to put messages inside the data
     * structure.
     *
     * @param message The last message that arrived at the client and needs to be memorized into the
     * buffer.
     */
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

    /**
     *  This is a debugging method and is used to understand what is currently inside the Buffer.
     */
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

    /**
     *  This method computes whether the Buffer is empty or not.
     *
     *  @return A Boolean telling us whether the Buffer is empty or not
     */
    public boolean isEmpty(){
        if(freeSpace == dimension){
            return true;
        }
        return false;
    }

    /**
     *  Public setter for Client
     *
     *  @param client The client for the setter
     */
    public void setClient(Client client){
        this.client = client;
    }
}
