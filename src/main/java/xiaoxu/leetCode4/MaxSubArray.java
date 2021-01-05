package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/12/31 9:37
 */
public class MaxSubArray{

    @Test
    public void test(){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    /**
     * 给定一个整数数组，找出总和最大的连续数列，并返回总和。
     * -2 -1 -4 -5
     * 输入： [-2,1,-3,4,-1,2,1,-5,4]
     * 输出： 6
     * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */
    public int maxSubArray(int[] nums) {
        int temp = nums[0], sum = temp;
        for(int i = 1; i < nums.length; i++){
            if(temp > 0){
                temp += nums[i];
            }else{
                temp = nums[i];
            }
            if(temp > sum){
                sum = temp;
            }
        }
        return sum;
    }
}

