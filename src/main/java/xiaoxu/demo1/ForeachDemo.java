package xiaoxu.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xx
 * @create 2020/9/16 17:17
 */
public class ForeachDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("xiaoxu", "ix");
        map.put("xiaoli", "sf");
        map.put("xiaoliu", "xfa");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach(o -> {
            System.out.println(o.getKey() + ":" + o.getValue());
        });
    }
}
