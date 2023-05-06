package org.example.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by ChenHao on 2023/4/25 is 14:56.
 *
 * @author tsinglink
 */

public class NettyServer {

	public void bing(int port) {
		//配置服务端NIO线程组
		EventLoopGroup parentGroup = new NioEventLoopGroup(); //NioEventLoopGroup extends MultithreadEventLoopGroup Math.max(1, SystemPropertyUtil.getInt("io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));
		EventLoopGroup childGroup = new NioEventLoopGroup();

		PooledByteBufAllocator allocator = new PooledByteBufAllocator(true);
		allocator.heapBuffer(2048, 1024 * 1024); // 最大容量为1MB
		//Bootstrap bootstrap = new Bootstrap().option(ChannelOption.ALLOCATOR, allocator);
		// 设置自定义allocator

		try {
			ServerBootstrap serverBootstrap = new ServerBootstrap();
			serverBootstrap.group(parentGroup, childGroup)
					.channel(NioServerSocketChannel.class)
					.option(ChannelOption.SO_BACKLOG, 128)	// tcp/ip 默认连接数
					//.option(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(65535))
					//.option(ChannelOption.SO_BROADCAST, true)
					//.option(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(65535))
					//.option(ChannelOption.ALLOCATOR, allocator)
					//.option(ChannelOption.SO_RCVBUF, 1024 * 1024) // 设置接收缓冲区大小为1MB
					//.option(ChannelOption.SO_RCVBUF, 1024) // 设置接收缓冲区大小为1MB

					.childHandler(new MyChannelInitializer());
			ChannelFuture sync = serverBootstrap.bind(port).sync();
			sync.channel().closeFuture().sync();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			childGroup.shutdownGracefully();
			parentGroup.shutdownGracefully();
		}

	}

}
