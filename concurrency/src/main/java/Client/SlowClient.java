package Client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

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
