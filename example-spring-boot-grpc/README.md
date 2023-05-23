# example-spring-boot-grpc

### 什么是gRPC

gRPC 是Google发起的一个开源远程过程调用 系统。该系统基于HTTP/2 协议传输，使用**Protocol Buffers** 作为接口描述语言。 其他功能： 认证 双向流 流控制 过期 最常见的应用场景是： 微服务框架下，多种语言服务之间的高效交互。 将手机服务、浏览器连接至后台 产生高效的客户端库。

**简单来说就是，基于Protocol Buffers通信协议的RPC框架**

### 生成，使用的是 java-grpc 模块的组建

### 运行

#### 使用spring启动Grpc服务
```java
@Component
public class GrpcServerStartupRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ServerBuilder serverBuilder = ServerBuilder
                .forPort(8081)
                .addService(new HelloServiceImpl());

        Server server = serverBuilder.build();
        serverBuilder.intercept(TransmitStatusRuntimeExceptionInterceptor.instance());
        server.start();
        startDaemonAwaitThread(server);
    }

    private void startDaemonAwaitThread(Server server) {
        Thread awaitThread = new Thread(() -> {
            try {
                server.awaitTermination();
            } catch (InterruptedException ignore) {

            }
        });
        awaitThread.setDaemon(false);
        awaitThread.start();
    }
}
```

#### 客户端
```java
@SpringBootApplication
@RestController
public class ExampleGrpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleGrpcApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity test() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8081)
                .usePlaintext()
                .build();
        Stopwatch stopwatch = Stopwatch.createStarted();
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Ga0x")
                .setLastName("gRPC")
                .build());
        System.out.println(stopwatch.stop());
        System.out.println("Response received from server:\n" + helloResponse);

        channel.shutdown();
        return ResponseEntity.ok(helloResponse.getGreeting());
    }
}
```
