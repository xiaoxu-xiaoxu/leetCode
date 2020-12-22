package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/22 9:17
 */
public class CheckPermutation{

    @Test
    public void test(){
        boolean b = checkPermutation("bb", "ac");
        System.out.println(b);
    }

    /**
     * 给定两个字符串 s1 和 s2，请编写一个程序，
     * 确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     * 输入: s1 = "abc", s2 = "bad"
     * 输出: false
     * 输入: s1 = "abc", s2 = "bca"
     * 输出: true
     */
    public boolean checkPermutation(String s1, String s2) {
        if(s1.length() == 0 && s2.length() == 0){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        char[] oChar = s1.toCharArray();
        char[] tChar = s2.toCharArray();
        Arrays.sort(oChar);
        Arrays.sort(tChar);
        for(int i = 0; i < oChar.length; i++){
            if(oChar[i] != tChar[i]){
                return false;
            }
        }
        return true;
    }
}
