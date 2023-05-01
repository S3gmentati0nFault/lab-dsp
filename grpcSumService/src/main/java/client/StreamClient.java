package client;

import com.example.grpc.StreamSumGrpc;
import com.example.grpc.StreamSumGrpc.*;
import com.example.grpc.Sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class StreamClient {
    public static void main(String[] args) {
        System.out.println("Chiamata asincrona a servizio di somma");
        asynchronousStreamCall();
        System.out.println("\n...Done!");
    }

    private static void asynchronousStreamCall(){
        ManagedChannel channel = ManagedChannelBuilder
                .forTarget("localhost:6789")
                .usePlaintext()
                .build();

        StreamSumStub stub = StreamSumGrpc.newStub(channel);

        StreamObserver<StreamSumRequest> stream = stub.streamStreamSum(
                new StreamObserver<StreamSumResponse>() {
                @Override
                public void onNext(StreamSumResponse value) {
                    System.out.println(value);
                }

                @Override
                public void onError(Throwable t) {}

                @Override
                public void onCompleted() {}
            });

        for(int i = 0; i < 10; ++i){
            StreamSumRequest req = StreamSumRequest.newBuilder()
                    .setN1(i)
                    .setN2(i+1)
                    .build();

            stream.onNext(req);
        }
        try {
            channel.awaitTermination(10, TimeUnit.SECONDS);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
