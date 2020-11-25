package xiaoxu.demo1;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author xx
 * @create 2020/9/7 9:36
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        InputStream is = PropertiesDemo.class.getClassLoader().getResourceAsStream("test.properties");
        //FileInputStream is = new FileInputStream("test.properties");
        Properties properties = new Properties();

        properties.load(is);
        String property = properties.getProperty("name");
        System.out.println(property);
        is.close();
    }
}
