package org.example;

import java.io.OutputStream;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9090);
        //构造一个Person对象
        StudentBean.Student person = StudentBean.Student.newBuilder().setName("陈哈哈").setAge(50).setGender("male").build();
        OutputStream os = socket.getOutputStream();
        //将Person对象写到输出流中
        os.write(person.toByteArray());
        os.flush();
        //这里注意一定要关闭流，否则服务端会报错
        os.close();
        System.out.println("client send person");
    }
}
