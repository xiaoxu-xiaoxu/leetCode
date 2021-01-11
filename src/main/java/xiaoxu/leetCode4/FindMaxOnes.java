package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/1/11 9:34
 */
public class FindMaxOnes{

    @Test
    public void test(){
        int[] arr = {1,1,0,1,1,1};
        int[] arr2 = {1};
        System.out.println(findMaxConsecutiveOnes(arr2));
    }

    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                result = Math.max(count, result);
                count = 0;
            }
        }
        return Math.max(count, result);
    }
}
