package com.jarvan.springbootgrpc.rpc;

import com.jarvan.grpcdemo.grpc.MemberLoginRequest;
import com.jarvan.grpcdemo.grpc.MemberLoginResponse;
import com.jarvan.grpcdemo.grpc.MemberLoginServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

/**
 * 描述：
 * Created by zjw on 2021/5/25 10:29
 */
@GRpcService
public class MemberLoginServiceImpl extends MemberLoginServiceGrpc.MemberLoginServiceImplBase {

    @Override
    public void memberLogin(MemberLoginRequest request, StreamObserver<MemberLoginResponse> responseObserver) {
        String token = "";
        if("123456".equals(request.getMember().getPassword())){
            token = "success";
        }

        MemberLoginResponse response = MemberLoginResponse
                .newBuilder()
                .setToken(token)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
