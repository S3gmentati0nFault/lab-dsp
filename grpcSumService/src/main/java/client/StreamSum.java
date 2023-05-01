package client;

import com.example.grpc.StreamSumGrpc;
import com.example.grpc.Sum.*;
import io.grpc.stub.StreamObserver;

public class StreamSum extends StreamSumGrpc.StreamSumImplBase {
    @Override
    public StreamObserver<StreamSumRequest>
    streamStreamSum(StreamObserver<StreamSumResponse> responseObserver) {
        return new StreamObserver<StreamSumRequest>() {
            @Override
            public void onNext(StreamSumRequest value) {
                StreamSumResponse response = StreamSumResponse.newBuilder()
                        .setSum(value.getN1() + value.getN2())
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.print("Ciao");
            }
        };
    }
}
