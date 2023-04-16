package buffer;

import extra.Colors;
import extra.Logger;
import thread.BufferReader;
import thread.BufferWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BufferDispatcher extends Thread {
    private int port;
    private Buffer buffer;

    public BufferDispatcher(int port, Buffer buffer)
            throws IOException, InterruptedException {
        this.port = port;
        this.buffer = buffer;
    }

    public void load() throws IOException, InterruptedException {
        Logger.notice("Starting BufferDispatcher");
        try (ServerSocket listenSocket =
                     new ServerSocket(port)) {

            Logger.notice("Opening listener port at >> " + port);
            while (true) {
                Socket bufferSocket = listenSocket.accept();
                BufferReader bufferReader =
                        new BufferReader(buffer);
                BufferWriter bufferWriter =
                        new BufferWriter(bufferSocket, buffer);
                bufferReader.start();
                bufferWriter.start();

                bufferReader.join();
            }
        }
        catch(Exception e){
            Logger.error("An exception was thrown during the connection process");
        }
    }

    @Override
    public void run(){
        try {
            load();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
