package client;

import com.example.grpc.SimpleSumGrpc.SimpleSumImplBase;
import com.example.grpc.Sum.*;
import io.grpc.stub.StreamObserver;

public class SimpleSum extends SimpleSumImplBase {
    @Override
    public void streamSimpleSum(SimpleSumRequest req,
                                StreamObserver<SimpleSumResponse> streamObserver){
        System.out.print(req.getN1() + " + " + req.getN2());

        SimpleSumResponse sumResponse = SimpleSumResponse.newBuilder()
                .setSum(req.getN1() + req.getN2())
                .build();

        streamObserver.onNext(sumResponse);
        streamObserver.onCompleted();
    }
}
