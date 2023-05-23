package com.jarvan.grpcdemo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: MemberLoginSerbice.proto")
public final class MemberLoginServiceGrpc {

  private MemberLoginServiceGrpc() {}

  public static final String SERVICE_NAME = "com.jarvan.grpcdemo.grpc.MemberLoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jarvan.grpcdemo.grpc.MemberLoginRequest,
      com.jarvan.grpcdemo.grpc.MemberLoginResponse> getMemberLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "member_login",
      requestType = com.jarvan.grpcdemo.grpc.MemberLoginRequest.class,
      responseType = com.jarvan.grpcdemo.grpc.MemberLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jarvan.grpcdemo.grpc.MemberLoginRequest,
      com.jarvan.grpcdemo.grpc.MemberLoginResponse> getMemberLoginMethod() {
    io.grpc.MethodDescriptor<com.jarvan.grpcdemo.grpc.MemberLoginRequest, com.jarvan.grpcdemo.grpc.MemberLoginResponse> getMemberLoginMethod;
    if ((getMemberLoginMethod = MemberLoginServiceGrpc.getMemberLoginMethod) == null) {
      synchronized (MemberLoginServiceGrpc.class) {
        if ((getMemberLoginMethod = MemberLoginServiceGrpc.getMemberLoginMethod) == null) {
          MemberLoginServiceGrpc.getMemberLoginMethod = getMemberLoginMethod =
              io.grpc.MethodDescriptor.<com.jarvan.grpcdemo.grpc.MemberLoginRequest, com.jarvan.grpcdemo.grpc.MemberLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "member_login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jarvan.grpcdemo.grpc.MemberLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jarvan.grpcdemo.grpc.MemberLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MemberLoginServiceMethodDescriptorSupplier("member_login"))
              .build();
        }
      }
    }
    return getMemberLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberLoginServiceStub newStub(io.grpc.Channel channel) {
    return new MemberLoginServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberLoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MemberLoginServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberLoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MemberLoginServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MemberLoginServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void memberLogin(com.jarvan.grpcdemo.grpc.MemberLoginRequest request,
        io.grpc.stub.StreamObserver<com.jarvan.grpcdemo.grpc.MemberLoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMemberLoginMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMemberLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jarvan.grpcdemo.grpc.MemberLoginRequest,
                com.jarvan.grpcdemo.grpc.MemberLoginResponse>(
                  this, METHODID_MEMBER_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class MemberLoginServiceStub extends io.grpc.stub.AbstractStub<MemberLoginServiceStub> {
    private MemberLoginServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberLoginServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberLoginServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberLoginServiceStub(channel, callOptions);
    }

    /**
     */
    public void memberLogin(com.jarvan.grpcdemo.grpc.MemberLoginRequest request,
        io.grpc.stub.StreamObserver<com.jarvan.grpcdemo.grpc.MemberLoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMemberLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MemberLoginServiceBlockingStub extends io.grpc.stub.AbstractStub<MemberLoginServiceBlockingStub> {
    private MemberLoginServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberLoginServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberLoginServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberLoginServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jarvan.grpcdemo.grpc.MemberLoginResponse memberLogin(com.jarvan.grpcdemo.grpc.MemberLoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getMemberLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MemberLoginServiceFutureStub extends io.grpc.stub.AbstractStub<MemberLoginServiceFutureStub> {
    private MemberLoginServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberLoginServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberLoginServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberLoginServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jarvan.grpcdemo.grpc.MemberLoginResponse> memberLogin(
        com.jarvan.grpcdemo.grpc.MemberLoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMemberLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MEMBER_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MemberLoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MemberLoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MEMBER_LOGIN:
          serviceImpl.memberLogin((com.jarvan.grpcdemo.grpc.MemberLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.jarvan.grpcdemo.grpc.MemberLoginResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MemberLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberLoginServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jarvan.grpcdemo.grpc.MemberLoginSerbice.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberLoginService");
    }
  }

  private static final class MemberLoginServiceFileDescriptorSupplier
      extends MemberLoginServiceBaseDescriptorSupplier {
    MemberLoginServiceFileDescriptorSupplier() {}
  }

  private static final class MemberLoginServiceMethodDescriptorSupplier
      extends MemberLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MemberLoginServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MemberLoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberLoginServiceFileDescriptorSupplier())
              .addMethod(getMemberLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
