package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) throws Exception {
		int port = 9091;
		Server server = ServerBuilder
				.forPort(port)
				.addService(new HelloServiceImpl())
				.build()
				.start();
		System.out.println("server started, port : " + port);
        server.awaitTermination();
	}
}
