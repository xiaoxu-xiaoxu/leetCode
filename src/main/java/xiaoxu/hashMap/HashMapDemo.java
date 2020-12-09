package xiaoxu.hashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xx
 * @create 2020/12/9 10:51
 */
public class HashMapDemo{

    @Test
    public void test(){
        System.out.println(1 >> 2);
        Map<Integer, String> map = new HashMap<>(2);
        map.put(1, "s");
        map.get(1);
    }
}
