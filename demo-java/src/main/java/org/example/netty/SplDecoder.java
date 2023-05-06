package org.example.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

/**
 * Created by ChenHao on 2023/5/6 is 10:07.
 *
 * @author tsinglink
 */

public class SplDecoder extends MessageToMessageDecoder {



	@Override
	protected void decode(ChannelHandlerContext ctx, Object msg, List out) throws Exception {
		System.out.println("正在进行消息解码");
		ByteBuf byteBuf = (ByteBuf) msg;
		// 传递到下一个handler
		out.add(new MyServerHandler());
	}
}