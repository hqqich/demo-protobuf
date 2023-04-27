package org.example.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import org.example.protobuf.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ChenHao on 2023/4/25 is 14:51.
 *
 * @author tsinglink
 */

public class MyServerHandler extends ChannelInboundHandlerAdapter {

    public static final Logger logger = LoggerFactory.getLogger(MyServerHandler.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        try {
            ByteBuf buf = (ByteBuf) msg;

            byte[] bytes = new byte[buf.readableBytes()];
            buf.readBytes(bytes);

            logger.info("{} 接受到消息： {}", LocalDateTime.now(), new String(bytes, Charset.forName("GBK")));

            //从输入流中解析出Person对象
            Person person = Person.parseFrom(bytes);
            if (person != null) {
                System.out.println("server received data:\n" + person.toString());
            }

        } finally {
            ReferenceCountUtil.release(msg);
        }


    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
