package xiaoxu.demo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author xx
 * @create 2020/10/23 9:34
 */
public class HashMapIteratorDemo{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("x", 1);
        map.put("z", 23);
        map.put("e", 65);
        map.put("r", 9);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
/*
        Map<Integer,String> map =new HashMap<Integer,String>();
        map.put(1, "xiao");
        map.put(2, "chao");
        map.put(3, "shang");
        map.put(4, "xue");

        Iterator<Map.Entry<Integer,String>> entries = map.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer,String> entry = entries.next();
            System.out.println("方法三：key = "+entry.getKey()+"--value="+entry.getValue());
        }*/

    }
}
