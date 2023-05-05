package org.example;

import com.google.protobuf.ByteString;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("server started...");
		Socket socket = ss.accept();
		System.out.println("a client connected!");

		ByteString bytes = ByteString.readFrom(socket.getInputStream());
		System.out.println("==================" + bytes.toString());

		//从输入流中解析出Person对象
		StudentBean.Student person = StudentBean.Student.parseFrom(bytes);
		if (person != null) {
			System.out.println("server received data:\n" + person.toString());
		}
		ss.close();
	}
}

