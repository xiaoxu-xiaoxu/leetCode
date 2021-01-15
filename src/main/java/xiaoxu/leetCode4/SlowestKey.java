package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2021/1/13 13:11
 */
public class SlowestKey{

    @Test
    public void test(){
        int[] arr = {9,29,49,50};
        System.out.println(slowestKey(arr, "cbcd"));
    }

    /**
     * 给你一个长度为 n 的字符串 keysPressed ，其中 keysPressed[i]
     * 表示测试序列中第 i 个被按下的键。releaseTimes
     * 是一个升序排列的列表，其中 releaseTimes[i] 表示松开第 i 个键的时间。
     * 字符串和数组的 下标都从 0 开始 。第 0 个键在时间为 0 时被按下，
     * 接下来每个键都 恰好 在前一个键松开时被按下。
     * 测试人员想要找出按键 持续时间最长 的键。第 i 次按键的持续时间为 releaseTimes[i] - releaseTimes[i - 1]
     * ，第 0 次按键的持续时间为 releaseTimes[0] 。
     * 注意，测试期间，同一个键可以在不同时刻被多次按下，而每次的持续时间都可能不同。
     * 请返回按键 持续时间最长 的键，如果有多个这样的键，则返回 按字母顺序排列最大 的那个键
     * 输入：releaseTimes = [9,29,49,50], keysPressed = "cbcd"
     * 输出："c"
     * 解释：按键顺序和持续时间如下：
     * 按下 'c' ，持续时间 9（时间 0 按下，时间 9 松开）
     * 按下 'b' ，持续时间 29 - 9 = 20（松开上一个键的时间 9 按下，时间 29 松开）
     * 按下 'c' ，持续时间 49 - 29 = 20（松开上一个键的时间 29 按下，时间 49 松开）
     * 按下 'd' ，持续时间 50 - 49 = 1（松开上一个键的时间 49 按下，时间 50 松开）
     * 按键持续时间最长的键是 'b' 和 'c'（第二次按下时），持续时间都是 20
     * 'c'按字母顺序排列比 'b' 大，所以答案是 'c'
     *
     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] table = new int[releaseTimes.length];
        table[0] = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++){
            table[i] = releaseTimes[i] - releaseTimes[i - 1];
        }
        int[] clone = table.clone();
        Arrays.sort(clone);
        int max = clone[clone.length - 1];
        char result = '0';
        for(int i = 0; i < table.length; i++){
            if(max == table[i]){
                result = (char) Math.max(keysPressed.charAt(i), result);
            }
        }
        return result;
    }

    public char slowestKey1(int[] releaseTimes, String keysPressed) {
        char maxChar = keysPressed.charAt(0);
        int maxValue = releaseTimes[0];
        for (int i = 0; i < releaseTimes.length - 1; i++) {
            int tempValue = releaseTimes[i + 1] - releaseTimes[i];
            if(tempValue == maxValue) {
                maxValue = tempValue;
                char tempChar = keysPressed.charAt(i + 1);
                if(tempChar > maxChar) {
                    maxChar = tempChar;
                }
            }else if(tempValue > maxValue) {
                maxValue = tempValue;
                maxChar = keysPressed.charAt(i + 1);
            }
        }
        return maxChar;
    }

}
