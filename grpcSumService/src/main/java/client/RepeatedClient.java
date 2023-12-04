package client;

import com.example.grpc.RepeatedSumGrpc;
import com.example.grpc.RepeatedSumGrpc.*;
import com.example.grpc.Sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.TimeUnit;

/**
 * Repeated Sum Client class.
 */
public class RepeatedClient {
    /**
     * Test method for the repeated sum service.
     * 
     * @throws InterruptedException Unhandled exception coming from the asynchronous GRPC call.
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Chiamata asincrona a servizio di somma");
        asynchronousStreamCall();
        System.out.println("\n...Done!");
    }

    /**
     * Method that allows the caller to make a GRPC call to the remote process.
     * 
     * @throws InterruptedException
     */
    private static void asynchronousStreamCall() throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forTarget("localhost:6789")
                .usePlaintext()
                .build();

        RepeatedSumStub stub = RepeatedSumGrpc.newStub(channel);
        RepeatedSumRequest req = RepeatedSumRequest.newBuilder()
                .setN(3)
                .setT(5)
                .build();

        stub.streamRepeatedSum(req, new StreamObserver<RepeatedSumResponse>() {

            @Override
            public void onNext(RepeatedSumResponse value) {
                System.out.println(value.getSum());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                channel.shutdownNow();
            }
        });

        channel.awaitTermination(10, TimeUnit.SECONDS);
    }
}
