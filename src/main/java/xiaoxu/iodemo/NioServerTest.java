package xiaoxu.iodemo;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * @author xx
 * @create 2020/11/6 9:11
 */
public class NioServerTest{

    @Test
    public void clientTest(){
        SocketChannel socketChannel = null;
        FileChannel fileChannel = null;
        try{
            // 1.开启客户端通道
            socketChannel = SocketChannel.open(new InetSocketAddress(8090));
            // 2.开启发送文件通道
            fileChannel = FileChannel.open(Paths.get("xiao"), StandardOpenOption.READ);
            // 3.创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // 4.向服务端发送数据
            while(fileChannel.read(buffer) != -1){
                buffer.flip();
                socketChannel.write(buffer);
                buffer.clear();
            }
            // 7.关闭输出通道
            socketChannel.shutdownOutput();
            int len = 0;
            while((len = socketChannel.read(buffer)) != -1){
                buffer.flip();
                System.out.println(new String(buffer.array(), 0, len));
                buffer.clear();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // 8.关闭通道
            if(socketChannel != null){
                try{
                    socketChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fileChannel != null){
                try{
                    fileChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void serverTest(){
        ServerSocketChannel serverSocketChannel = null;
        FileChannel fileChannel = null;
        SocketChannel accept = null;
        try{
            // 1.开启服务端通道
            serverSocketChannel = ServerSocketChannel.open();
            fileChannel = FileChannel.open(Paths.get("li"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
            // 2.监听端口号
            serverSocketChannel.bind(new InetSocketAddress(8090));
            // 3.开启接收通道
            accept = serverSocketChannel.accept();
            // 4.创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // 5.读取数据
            while(accept.read(buffer) != -1){
                buffer.flip();
                fileChannel.write(buffer);
                buffer.clear();
            }
            // 6.向服务器发送消息
            buffer.put("已成功接收数据".getBytes());
            buffer.flip();
            accept.write(buffer);
            buffer.clear();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // 7.关闭通道
            if(fileChannel != null){
                try{
                    fileChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(accept != null){
                try{
                    accept.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(serverSocketChannel != null){
                try{
                    serverSocketChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }




}
