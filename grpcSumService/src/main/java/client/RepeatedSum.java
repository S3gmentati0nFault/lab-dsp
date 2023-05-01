package client;

import com.example.grpc.RepeatedSumGrpc.*;
import com.example.grpc.Sum.*;
import io.grpc.stub.StreamObserver;

public class RepeatedSum extends RepeatedSumImplBase {
    @Override
    public void streamRepeatedSum(RepeatedSumRequest req,
                                  StreamObserver<RepeatedSumResponse> streamObserver) {
        for(int i = 1; i <= req.getT(); ++i){
            RepeatedSumResponse response = RepeatedSumResponse.newBuilder()
                    .setSum(req.getN() * i)
                    .build();

            streamObserver.onNext(response);
        }
        streamObserver.onCompleted();
    }
}
