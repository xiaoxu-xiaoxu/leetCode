package xiaoxu.iodemo;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author xx
 * @create 2020/11/6 9:54
 */
public class NioNoBlockingTest{
    public static void main(String[] args) throws Exception{
        // 1.开始网络通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress(8090));
        // 2.开启非阻塞模式
        socketChannel.configureBlocking(false);
        // 3.开启传入文件通道
        //FileChannel fileChannel = FileChannel.open(Paths.get("xiao"), StandardOpenOption.READ);
        // 4.创建缓冲区
        Scanner scanner = new Scanner(System.in);
        // 5.传输数据
        while(true){
            for(int i = 0; i < 100; i++){
                int finalI = i;
                new Thread(() -> {
                    try{
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        buffer.put(("你好我是线程：" + finalI).getBytes());
                        buffer.flip();
                        socketChannel.write(buffer);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }).start();
            }
            System.out.println("请输入：");
            String next = scanner.next();
        }
        // 6.关闭缓冲区
        //fileChannel.close();
        //socketChannel.close();
    }

    @Test
    public void server() throws Exception{
        // 1.开启通道，设置监听端口号
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8090));
        // 2.开启非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // 3.开启选择器
        Selector selector = Selector.open();
        // 4.将通道注册进选择器中
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        writeBuffer.put("receive message".getBytes());
        writeBuffer.flip();
        // 5.轮询，如果选择器中有就绪的那么就进入，准备接收、读取、写出等操作
        while(selector.select() > 0){
            Iterator<SelectionKey> it = selector.selectedKeys().iterator();
            // 6.获取所有就绪的SelectionKey
            while(it.hasNext()){
                SelectionKey key = it.next();
                // 7.如果该通道是就绪状态，那么将其注册进选择器中
                if(key.isAcceptable()){
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    // 8.该通道开启非阻塞模式
                    socketChannel.configureBlocking(false);
                    // 9.注册进选择器中
                    socketChannel.register(selector, SelectionKey.OP_READ);
                }else if(key.isReadable()){// 10.如果该选择器是可读状态
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int len = 0;
                    while((len = channel.read(buffer)) > 0){
                        buffer.flip();
                        System.out.println(new String(buffer.array(), 0, len));
                        buffer.clear();
                    }
                    key.interestOps(SelectionKey.OP_WRITE);
                }else if(key.isWritable()){
                    writeBuffer.rewind();
                    SocketChannel channel = (SocketChannel) key.channel();
                    channel.write(writeBuffer);
                    writeBuffer.clear();
                    key.interestOps(SelectionKey.OP_READ);
                }
                it.remove();
            }
        }

    }

    @Test
    public void client() throws Exception{
        // 1.开始网络通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress(8090));
        // 2.开启非阻塞模式
        socketChannel.configureBlocking(false);
        // 3.开启传入文件通道
        FileChannel fileChannel = FileChannel.open(Paths.get("xiao"), StandardOpenOption.READ);
        // 4.创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 5.传输数据
        while(fileChannel.read(buffer) != -1){
            buffer.flip();
            socketChannel.write(buffer);
            buffer.clear();
        }

        // 6.关闭缓冲区
        fileChannel.close();
        socketChannel.close();
    }

}
