package client;

import buffer.Buffer;
import buffer.BufferDispatcher;
import extra.Logger;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client extends Thread{
    private int port;
    private Buffer buffer;
    private BufferDispatcher bufferDispatcher;

    public Client(){}

    public Client(int port, int dimension, int bufferPort)
            throws IOException, InterruptedException {
        this.port = port;
        buffer =
                new Buffer(dimension);
        bufferDispatcher =
                new BufferDispatcher(bufferPort, buffer);
    }

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
    public void setBuffer(Buffer buffer){
        this.buffer = buffer;
    }

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
