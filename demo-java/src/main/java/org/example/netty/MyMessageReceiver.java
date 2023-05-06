//package org.example.netty;
//
//import io.netty.buffer.ByteBuf;
//import io.netty.buffer.ByteBufInputStream;
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.handler.codec.ReplayingDecoder;
//import io.netty.handler.codec.TooLongFrameException;
//import io.netty.handler.codec.serialization.ClassResolvers;
//import io.netty.handler.codec.serialization.ObjectDecoder;
//import io.netty.handler.stream.ChunkedStream;
//import java.util.List;
//import java.io.InputStream;
//
///**
// * Created by ChenHao on 2023/5/6 is 9:04.
// *
// * @author tsinglink
// */
//
//public class MyMessageReceiver extends ReplayingDecoder<Void> {
//
//    private final ObjectDecoder objectDecoder = new ObjectDecoder(ClassResolvers.cacheDisabled(null));
//    private int maxObjectSize; // 实际上，这个值可以在类初始化时从配置文件或其他地方获取
//
//    public MyMessageReceiver(int maxObjectSize) {
//        this.maxObjectSize = maxObjectSize;
//    }
//
//    @Override
//    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
//        if (in.readableBytes() < 4) { // 如果ByteBuf中不足4个字节，说明没有接收到完整的消息长度字段，返回等待更多的数据。
//            return;
//        }
//
//        int msgLength = in.readInt(); // 先读取4个字节表示消息长度
//
//        if (msgLength > maxObjectSize) { // 如果读到的消息长度超过了预定义的最大值，抛出异常并关闭连接
//            ctx.close();
//            throw new TooLongFrameException("message length too long: " + msgLength);
//        }
//
//        if (in.readableBytes() < msgLength) { // 如果ByteBuf中的可读字节数尚未达到消息长度，说明还没有接收到完整的消息内容，返回等待更多的数据。
//            in.resetReaderIndex();
//            return;
//        }
//
//        // 读取所有消息内容
//        ByteBuf msgContentByteBuf = in.readSlice(msgLength);
//        ChunkedStream inputStream = new ChunkedStream(new ByteBufInputStream(msgContentByteBuf));// 使用ChunkedStream将ByteBuf转换为流
//
//        try {
//            Object obj = objectDecoder.decode(inputStream); // 使用对象解码器将流转换为实际的Java对象
//            out.add(obj);
//        } finally {
//            inputStream.close(); // 手动释放资源
//        }
//    }
//}