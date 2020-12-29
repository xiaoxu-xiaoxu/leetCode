package xiaoxu.leetCode4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xx
 * @create 2020/12/29 11:22
 */
public class IsUnique{

    /**
     * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
     * 输入: s = "leetcode"
     * 输出: false
     */
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < astr.length(); i++){
            if(!set.add(astr.charAt(i)))
                return false;
        }
        return true;
    }
}
