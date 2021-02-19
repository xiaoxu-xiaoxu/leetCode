package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/2/19 15:35
 */
public class MaxProduct{

    @Test
    public void test(){
        int[] nums = {10,2,5,2};
        System.out.println(maxProduct(nums));
    }

    /**
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * 请你计算并返回该式的最大值。
     * 输入：nums = [3,4,5,2]
     * 输出：12
     * 解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，
     * (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12
     * 输入：nums = [1,5,4,5]
     * 输出：16
     * 解释：选择下标 i=1 和 j=3（下标从 0 开始），则可以获得最大值 (5-1)*(5-1) = 16
     */
    public int maxProduct(int[] nums) {
        int max = nums[0], lMax = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                lMax = max;
                max = nums[i];
            }else if(nums[i] > lMax){
                lMax = nums[i];
            }
        }
        return (lMax - 1) * (max - 1);
    }
}
