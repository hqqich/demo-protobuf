# proto 学习

> 客户端工具：https://github.com/bloomrpc/bloomrpc
> 
> 里面有java代码和go代码
> 
> 有一个编译器，proto文件编译成java或go代码


![img.png](img/img.png)



| 模块                       | 功能                                                 |
|--------------------------|----------------------------------------------------|
| demo-java                | 使用netty实现socket服务，使用proto传输数据                      |
| demo-kotlin              | main方法用kotlin实现，引用demo-java模块，启动netty服务            |
| example-spring-boot-grpc | springboot启动grpc服务，基本grpc依赖                        |
| java-grpc                | 使用基本java启动Grpc服务，不使用springboot                     |
| spring-boot-grpc         | 使用grpc-spring-boot-starter，注解实现Grpc服务，可以使用Spring容器 |
| springboot-web           | 使用标准MVC接受proto数据，用base64加密字节数组                     |
