package com.jarvan.springbootgrpc.rpc;

import com.jarvan.grpcdemo.grpc.Member;
import com.jarvan.grpcdemo.grpc.MemberListRequest;
import com.jarvan.grpcdemo.grpc.MemberListResponse;
import com.jarvan.grpcdemo.grpc.MemberListServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

/**
 * 描述：
 * Created by zjw on 2021/5/25 10:32
 */
@GRpcService
public class MemberListServiceImpl extends MemberListServiceGrpc.MemberListServiceImplBase {

    @Override
    public void memberList(MemberListRequest request, StreamObserver<MemberListResponse> responseObserver) {
        Member jarvan = Member.newBuilder()
                .setPassword("123456")
                .setUsername("jarvan")
                .setInfo("hello jarvan")
                .build();

        Member hello = Member.newBuilder()
                .setPassword("123456")
                .setUsername("hello")
                .setInfo("hello world")
                .build();

        MemberListResponse.Builder builder = MemberListResponse.newBuilder();
        builder.addMember(jarvan);
        builder.addMember(hello);
        MemberListResponse response = builder.build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
