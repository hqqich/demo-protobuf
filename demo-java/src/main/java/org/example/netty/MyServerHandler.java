package org.example.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
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



            try {
                // 从输入流中解析出Person对象
                Person person = Person.parseFrom(bytes);
                if (person != null) {
                    System.out.println("接受到数据===========:\n" + person.toString());
                }
            } catch (Exception e) {
                logger.info("{} 接受到消息： {}", LocalDateTime.now(), new String(bytes, Charset.forName("GBK")));
            }


            // 注意的这里
            // 必须这么写，不然将会造成无法给客户端返回信息的情况，我也不清楚是为什么。。。。既然writeAndFlush方法接收Object类型，那么为什么必须要传递ByteBuf才可以呢?
            ByteBuf result = Unpooled.copiedBuffer("bbbbb".getBytes());
            ctx.write(result);


            ctx.flush();


        } finally {
            ReferenceCountUtil.release(msg);
            // 如果写在这里，相当于一应一答，回完一次消息就断开
            ctx.close();
        }


    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        // 写在这里是连接断开，就结束
        //ctx.close();
    }
}
