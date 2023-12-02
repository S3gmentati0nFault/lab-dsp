package Client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *  Client class for the Theater exercise.
 */
public class Client {
    /**
     *  Main method for the Client class, it allows to buy a ticket from the server through the
     *  socket system.
     *
     *  @throws IOException Unhandled IOException coming out of the BufferedReader inputStream.
     */
    public static void main(String[] args) throws IOException {
        String seat;
        Socket serverSocket =
                new Socket("localhost", 7000);

        BufferedReader inputStream =
                new BufferedReader(
                        new InputStreamReader(serverSocket.getInputStream()));

        seat = inputStream.readLine();
        if(seat.equals("-1")){
            System.out.println("I posti sono finiti!");
        }
        else{
            System.out.println("POSTO RISERVATO: " + inputStream.readLine());
        }
        serverSocket.close();
    }
}
