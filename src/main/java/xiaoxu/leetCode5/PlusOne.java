package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/1/18 10:37
 */
public class PlusOne{

    @Test
    public void test(){
        int[] arr = {1,9,9,9};
        int[] ints = plusOne(arr);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     * 输入：digits = [4,3,2,1]
     * 输出：[4,3,2,2]
     * 解释：输入数组表示数字 4321。
     * 输入：digits = [0]
     * 输出：[1]
     */
    public int[] plusOne(int[] digits) {
        int count = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                break;
            }
            count++;
        }
        if(count == digits.length){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
