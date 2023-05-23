package org.springboot.controller;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Base64;
import javax.servlet.http.HttpServletRequest;
import org.example.protobuf.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChenHao on 2023/5/23 is 16:29.
 *
 * @author tsinglink
 */

@RestController
@RequestMapping("/test")
public class ProtobufController {

	@RequestMapping("/test1")
	public String test1(HttpServletRequest request) {

		//获取请求体里的字符串
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = request.getReader();
			String str;
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String requestBody = sb.toString();

		byte[] decode = null;
		try {
			//使用base64解码读取到的字符串，
			decode = Base64.getDecoder().decode(requestBody);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Person person;
		try {
			// 将解析出来的字符串进行反序列化
			person = Person.parseFrom(decode);
		} catch (Exception e) {
			// 如果解析失败，就返回一个特殊的实例
			person = Person.newBuilder()
					.setId(1)
					.setName("hqqich")
					.setEmail("hqqich1314@outlook.com")
					.addPhones(
							Person.PhoneNumber.newBuilder()
									.setNumber("010-1234567")
									.setType(Person.PhoneType.HOME))
					.build();
			e.printStackTrace();
		}
		// 查看是否反序列化成功
		System.err.println("teacher=" + person.toString());

		// 返回一个序列化并且经过base64编码的字符串
		Person.Builder builder = Person.newBuilder()
				.setId(1)
				.setName("hqqich")
				.setEmail("hqqich1314@outlook.com")
				.addPhones(
						Person.PhoneNumber.newBuilder()
								.setNumber("010-1234567")
								.setType(Person.PhoneType.HOME));
		return Base64.getEncoder().encodeToString(builder.build().toByteArray());
	}



	// 这个使用不了
	@RequestMapping("/test2")
	public String test2(@RequestBody Person person) {

		return new Gson().toJson(person);
	}

}