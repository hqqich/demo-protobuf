package org.example.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ChenHao on 2023/4/25 is 14:51.
 *
 * 杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个杀不了凯乐科技两个test
 *
 * @author tsinglink
 */

public class MyServerHandler extends ChannelInboundHandlerAdapter {

	public static final Logger logger = LoggerFactory.getLogger(MyServerHandler.class);

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

		try {
			ByteBuf buf = (ByteBuf) msg;

			int i = buf.readableBytes();

			System.out.println(i);

			//if (i > 2048) {
			//	System.out.println("aa");
			//}
			//
			//byte[] bytes = new byte[i];
			//buf.readBytes(bytes);
			//
			//try {
			//	// 从输入流中解析出Person对象
			//	//Person person = Person.parseFrom(bytes);
			//	//if (person != null) {
			//	//	System.out.println("接受到数据(person)===========:\n" + person.toString());
			//	//}
			//	// 从输入流中解析出Person对象
			//	PersonList personList = PersonList.parseFrom(bytes);
			//	if (personList != null) {
			//		System.out.println("接受到数据(personList)===========:\n" + personList.toString());
			//	}
			//} catch (Exception e1) {
            //    try {
            //        // 从输入流中解析出Person对象
            //        PersonList personList = PersonList.parseFrom(bytes);
            //        if (personList != null) {
            //            System.out.println("接受到数据(personList)===========:\n" + personList.toString());
            //        }
            //    } catch (Exception e2) {
            //        logger.info("{} 接受到消息： {}", LocalDateTime.now(), new String(bytes, Charset.forName("GBK")));
			//		System.out.println(new String(bytes, Charset.forName("GBK")).length());
			//
			//	}
			//}
			//
			//// 注意的这里
			//// 必须这么写，不然将会造成无法给客户端返回信息的情况，我也不清楚是为什么。。。。既然writeAndFlush方法接收Object类型，那么为什么必须要传递ByteBuf才可以呢?
			//ByteBuf result = Unpooled.copiedBuffer("bbbbb".getBytes());
			//ctx.write(result);
			//
			//ctx.flush();


		} finally {
			ReferenceCountUtil.release(msg);
			// 如果写在这里，相当于一应一答，回完一次消息就断开
			//ctx.close();
		}


	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		// 写在这里是连接断开，就结束
		ctx.close();
	}
}
