package xiaoxu.leetCode3;

/**
 * @author xx
 * @create 2020/12/7 15:50
 */
public class RunningSum{

    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * 请返回 nums 的动态和。
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4]
     */
    public int[] runningSum(int[] nums) {
        int sum = 0, i = 0;
        int[] result = new int[nums.length];
        for(int n : nums){
            sum += n;
            result[i++] = sum;
        }
        return result;
    }
}
