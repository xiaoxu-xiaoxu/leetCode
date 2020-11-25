package xiaoxu.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xx
 * @create 2020/9/8 17:04
 */
public class FileReadDemo {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("xiaoxu.txt");
            fos = new FileOutputStream("xiaoxu1.txt");

            byte[] arr = new byte[1024];
            int len;
            while ((len = fis.read(arr)) != -1){
               fos.write(arr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
