package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/12/29 9:56
 */
public class FindNumbers{

    @Test
    public void test(){
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    /**
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     * 输入：nums = [12,345,2,6,7896]
     * 输出：2
     * 100000
     */
    public int findNumbers(int[] nums) {
        int count = 0;
        String str;
        for(int i = 0; i < nums.length; i++){
            str = String.valueOf(nums[i]);
            if(str.length() % 2 == 0)
                count++;
        }
        return count;
    }
}
