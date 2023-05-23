package com.jarvan.springbootgrpc.config;

import com.jarvan.grpcdemo.grpc.MemberListServiceGrpc;
import com.jarvan.grpcdemo.grpc.MemberLoginServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 * Created by zjw on 2021/5/25 10:03
 */
@Configuration
public class GrpcConfig {

    @Bean
    ManagedChannel channel(@Value("${app-config.grpc-server-name}") String name,
                           @Value("${app-config.grpc-server-port}") Integer port) {
        return ManagedChannelBuilder.forAddress(name, port).usePlaintext().build();
    }

    @Bean
    MemberListServiceGrpc.MemberListServiceBlockingStub memberListServiceBlockingStub(ManagedChannel channel) {
        return MemberListServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    MemberLoginServiceGrpc.MemberLoginServiceBlockingStub memberLoginServiceBlockingStub(ManagedChannel channel) {
        return MemberLoginServiceGrpc.newBlockingStub(channel);
    }
}
