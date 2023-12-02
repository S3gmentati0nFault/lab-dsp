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

/**
 *  BufferDispatcher class, extends Trhread class and basically initializes the read and write
 *  cycles on the Buffer associated to the Client.
 */
public class BufferDispatcher extends Thread {
    private int port;
    private Buffer buffer;

    /**
     *  BufferDispatcher constructor.
     *
     *  @param port The port associated with the client.
     *  @param buffer The buffer associated with the client.
     */
    public BufferDispatcher(int port, Buffer buffer)
            throws IOException, InterruptedException {
        this.port = port;
        this.buffer = buffer;
    }

    /**
     *  This method starts the various threads and waits for them to terminate the execution on the
     *  buffer.
     *
     *  @throws IOException Unhandled exception for the IO process, it's linked to the use of
     *  sockets to handle message passing.
     *  @throws InterruptedException Unhandled exception probably linked to the use of the join
     *  method.
     */
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

    /**
     * Override of the run method associated to the Thread class.
     */
    @Override
    public void run(){
        try {
            load();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
