package client;

import buffer.Buffer;
import buffer.BufferDispatcher;
import extra.Logger;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *  The Client class handles both "front-end" and a bit of the useful checks in "back-end"
 */
public class Client extends Thread{
    private int port;
    private Buffer buffer;
    private BufferDispatcher bufferDispatcher;
    
    /**
     *  Empty constructor for Client class.
     */
    public Client(){}

    /**
     *  Custom constructor for the Client class.
     *
     *  @throws IOException Unhandled exception that is probably due to the constructor call for BufferDispatcher.
     *  @throws InterruptedException Unhandled exception that is probably due to the constructor
     *  call for BufferDispatcher.
     *
     *  @see BufferDispatcher
     */
    public Client(int port, int dimension, int bufferPort)
            throws IOException, InterruptedException {
        this.port = port;
        buffer =
                new Buffer(dimension);
        bufferDispatcher =
                new BufferDispatcher(bufferPort, buffer);
    }


    /**
     *  This method handles the main read and write cycle it reads the information coming through
     *  the sockets and it writes them through the sockets.
     *
     *  @throws IOException Unhandled exception, probably coming from one of the constructor calls
     *  inside the code.
     *  @throws InterruptedException Unhandled exception, I'm not even trying anymore.
     */
    public void load() throws IOException, InterruptedException {
        boolean isAlive = false;
        Socket commSocket = null;

        Logger.notice("Starting Client");

        while(!isAlive){
            try{
                commSocket = new Socket("localhost", port);
                isAlive = true;
            } catch (IOException e) {
            }
        }
        Logger.notice("Connection to >> " + port + " >> successfull");
        DataOutputStream outputStream =
                new DataOutputStream(commSocket.getOutputStream());

        BufferedReader inputStream =
                new BufferedReader(
                        new InputStreamReader(System.in));
        Logger.request("Per favore, procedi ad autenticarti");
        Logger.interact("Inserisci il tuo nome");
        String name = inputStream.readLine();
        outputStream.writeBytes(name + "\n");
        Logger.notice("Chat started");

        String message = " ";

        while(!message.equalsIgnoreCase("%%end%%")){
            message = inputStream.readLine();
            outputStream.writeBytes(message + "\n");
        }
    }

    /**
     *  Setter for the Buffer instance variable.
     *
     *  @param buffer.
     */
    public void setBuffer(Buffer buffer){
        this.buffer = buffer;
    }

    /**
     *  Override of the run method from Thread class.
     */
    @Override
    public void run(){
        bufferDispatcher.start();
        try {
            load();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
