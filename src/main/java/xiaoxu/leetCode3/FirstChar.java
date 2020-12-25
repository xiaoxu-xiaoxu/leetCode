package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2020/12/23 17:35
 */
public class FirstChar{

    @Test
    public void test(){
        int i = firstUniqChar("loveleetcode");
        System.out.println(i);
    }

    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * s = "leetcode"
     * 返回 0
     * s = "loveleetcode"
     * 返回 2
     */
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return s.indexOf(s.charAt(i));
            }
        }
        return -1;
    }

}
