package org.example;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.example.protobuf.Person;

public class Main {

  public static void main(String[] args) throws Exception {

    Person person = Person.newBuilder()
        .setId(1)
        .setName("hqqich")
        .setEmail("hqqich1314@outlook.com")
        .addPhones(
            Person.PhoneNumber.newBuilder()
                .setNumber("010-1234567")
                .setType(Person.PhoneType.HOME))
        .build();

  /*
    序列化：
      byte[] toByteArray();: 序列化消息并返回一个包含其原始字节的字节数组。
      static Person parseFrom(byte[] data);: 从给定的字节数组中解析一条消息。
      void writeTo(OutputStream output);: 序列化消息并将其写入 OutputStream.
      static Person parseFrom(InputStream input);: 从一个消息中读取并解析消息 InputStream.
   */

    byte[] bytes = person.toByteArray();

    //byte[] imgbyte = decoder.decodeBuffer("刚刚将字节数组转成的字符串");
    OutputStream os = Files.newOutputStream(Paths.get("C:\\Users\\Administrator\\Desktop\\data\\person"));
    os.write(bytes, 0, bytes.length);
    os.flush();
    os.close();







  }
}