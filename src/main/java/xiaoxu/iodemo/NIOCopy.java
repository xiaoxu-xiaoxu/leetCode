package xiaoxu.iodemo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author xx
 * @create 2021/2/20 16:22
 */
public class NIOCopy{

    @Test
    public void test() throws Exception{
        File file = new File("li");
        FileInputStream is = new FileInputStream(file);
        FileChannel isChannel = is.getChannel();
        FileOutputStream os = new FileOutputStream(new File("li8"));
        FileChannel osChannel = os.getChannel();
        isChannel.transferTo(0, isChannel.size(), osChannel);
        is.close();
        os.close();
    }
}
