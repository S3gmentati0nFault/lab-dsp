package client;

import com.example.grpc.SimpleSumGrpc;
import com.example.grpc.Sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.grpc.SimpleSumGrpc.*;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.TimeUnit;

public class SimpleClient {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Chiamata asincrona a servizio di somma");
        asynchronousStreamCall();
        System.out.println("\n...Done!");
    }

    private static void asynchronousStreamCall() throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forTarget("localhost:6789")
                .usePlaintext()
                .build();

        SimpleSumStub stub = SimpleSumGrpc.newStub(channel);
        SimpleSumRequest req = SimpleSumRequest.newBuilder()
                .setN1(10)
                .setN2(40)
                .build();

        stub.streamSimpleSum(req, new StreamObserver<SimpleSumResponse>() {
            @Override
            public void onNext(SimpleSumResponse value) {
                int sum = value.getSum() + 50;
                System.out.println(" = " + sum);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage() + " coglione bastardo");
            }

            @Override
            public void onCompleted() {
                channel.shutdownNow();
            }
        });

        channel.awaitTermination(10, TimeUnit.SECONDS);
    }
}
