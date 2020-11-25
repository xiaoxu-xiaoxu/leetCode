package xiaoxu.iodemo;

import org.junit.Test;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Properties;

/**
 * @author xx
 * @create 2020/11/4 13:47
 */
public class PropertiesIoTest{

    @Test
    public void test9() throws Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8090));

        FileOutputStream xiao4 = new FileOutputStream("xiao4");
        FileChannel xiao4Channel = xiao4.getChannel();

        while(true){
            SocketChannel channel = serverSocketChannel.accept();
            if(channel != null){
                ByteBuffer buffer = ByteBuffer.allocate(5);
                while(channel.read(buffer) != -1){
                    buffer.flip();
                    xiao4Channel.write(buffer);
                    System.out.println(buffer.get(0));
                    buffer.clear();
                }
            }
        }

    }

    @Test
    public void test8() throws Exception{
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress(8090));

        ByteBuffer buffer = ByteBuffer.allocate(5);
        //buffer.put((byte)9);
        buffer.put((byte)6);

        while(buffer.hasRemaining()){
            buffer.flip();
            socketChannel.write(buffer);
        }
        socketChannel.close();
    }

    @Test
    public void test7() throws Exception{
        RandomAccessFile file1 = new RandomAccessFile("xiao", "rw");
        FileChannel file1Channel = file1.getChannel();

        RandomAccessFile file2 = new RandomAccessFile("xiao3", "rw");
        FileChannel file2Channel = file2.getChannel();

        file2Channel.transferFrom(file1Channel, 0L, file1Channel.size());

        file1Channel.close();
        file2Channel.close();
    }

    @Test
    public void test6(){
        ByteBuffer buffer = ByteBuffer.allocate(5);

        buffer.put((byte)1);
        buffer.put((byte)2);
        buffer.mark();
        buffer.put((byte)3);
        buffer.put((byte)5);
        buffer.reset();
        System.out.println(buffer.position());

        buffer.flip();

       /* buffer.get();
        System.out.println(buffer.position());
        System.out.println(buffer.mark());
        buffer.get();
        buffer.get();
        buffer.get();
        buffer.reset();
        System.out.println(buffer.get());*/
    }

    @Test
    public void test5(){
        FileInputStream is = null;
        FileOutputStream os = null;
        FileChannel isChannel = null;
        FileChannel osChannel = null;
        try{
            is = new FileInputStream("xiao");
            os = new FileOutputStream("xiao2");

            isChannel = is.getChannel();
            osChannel = os.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while(isChannel.read(buffer) != -1){
                buffer.flip();
                osChannel.write(buffer);
                buffer.clear();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(isChannel != null){
                try{
                    isChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(osChannel != null){
                try{
                    osChannel.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(is != null){
                try{
                    is.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(os != null){
                try{
                    os.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test4(){
        CharBuffer buffer = CharBuffer.allocate(2);
        buffer.append('2');
        //System.out.println(buffer.position());
        buffer.flip();
        char[] dst = new char[1];
        buffer.get(dst);
        for(int i = 0; i < dst.length; i++){
            System.out.print(dst[i] + "\t");
        }
        buffer.position(0);
        buffer.append('5');
    }

    @Test
    public void test3(){
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte)2);
        System.out.println(buffer.position());
    }

    @Test
    public void test2() throws Exception{
        FileInputStream fs = new FileInputStream("xiao");
        FileOutputStream os = new FileOutputStream("xiao1");

        byte[] arr = new byte[1024];
        int len;
        while((len = fs.read(arr)) != -1){
            os.write(arr, 0, len);
        }
        os.close();
        fs.close();
    }

    @Test
    public void test1(){
        InputStream is = PropertiesIoTest.class.getClassLoader().getResourceAsStream("test.properties");

        Properties properties = new Properties();
        try{
            properties.load(is);
            System.out.println(properties.get("username"));
            System.out.println(properties.get("password"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
