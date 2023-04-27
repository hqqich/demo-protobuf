package org.example.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ChenHao on 2023/4/25 is 14:49.
 *
 * @author tsinglink
 */

public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    public static final Logger logger = LoggerFactory.getLogger(MyChannelInitializer.class);


    // 初始化
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        logger.info("链接报告开始");
        logger.info("链接报告信息：有一客户端链接到本服务端");
        logger.info("链接报告IP:" + socketChannel.localAddress().getHostString());
        logger.info("链接报告Port:" + socketChannel.localAddress().getPort());
        logger.info("链接报告完毕");

        // 处理消息写在这
        socketChannel.pipeline().addLast(new MyServerHandler());

    }
}
