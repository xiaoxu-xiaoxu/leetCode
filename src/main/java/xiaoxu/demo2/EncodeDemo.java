package xiaoxu.demo2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author xx
 * @create 2020/10/23 11:11
 */
public class EncodeDemo{
    public static void main(String[] args){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(i + ", " + j + ", " + k);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("a", "1");
        treeMap.put("c", "3");
        treeMap.put("b", "2");
        Set<Map.Entry<String, String>> entries = treeMap.entrySet();
        for(Map.Entry<String, String> next : entries){
            System.out.println(next.getKey() + "-->" + next.getValue());
        }

       /* String str = " df";
        byte[] bytes = str.getBytes();
        for(int i = 0; i < bytes.length; i++){
            if(bytes[i] == 32){
                bytes[i] = 'x';
            }
        }
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        String s = new String(bytes);
        System.out.println(s);*/
    }
}
