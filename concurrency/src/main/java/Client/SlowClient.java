package Client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


/**
 *  A SlowClient class implemented to show that if a server is not used in a concurrent environment,
 *  the slowest systems will hinder its capacity to deal with other clients.
 */
public class SlowClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(20000);

        Socket serverSocket =
                new Socket("localhost", 7000);

        BufferedReader inputStream =
                new BufferedReader(
                        new InputStreamReader(serverSocket.getInputStream()));

        System.out.println("POSTO RISERVATO: " + inputStream.readLine());
    }
}
