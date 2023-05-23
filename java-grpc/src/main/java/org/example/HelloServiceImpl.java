package org.example;

import io.grpc.stub.StreamObserver;
import org.example.proto.HelloServiceGrpc;
import org.example.proto.Person;
import org.example.proto.PersonResponse;

/**
 * Created by ChenHao on 2023/5/23 is 19:35.
 *
 * @author tsinglink
 */

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(Person request, StreamObserver<PersonResponse> responseObserver) {
        PersonResponse personResponse = PersonResponse.newBuilder()
                .setGreeting("result")
                .build();
        responseObserver.onNext(personResponse);
        responseObserver.onCompleted();

    }
}
