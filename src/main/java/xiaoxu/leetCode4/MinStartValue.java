package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/1/8 15:12
 */
public class MinStartValue{

    @Test
    public void test(){
        int abs = Math.abs(-1);
        //System.out.println(abs);
        int[] arr = {-3};
        int[] arr1 = {-3,2,-3,4,2};
        System.out.println(minStartValue(arr));
    }

    /**
     * 给你一个整数数组 nums 。你可以选定任意的 正数 startValue 作为初始值。
     * 你需要从左到右遍历 nums 数组，并将 startValue 依次累加上 nums 数组中的值。
     * 请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 正数 作为 startValue 。
     *
     * 输入：nums = [-3,2,-3,4,2]
     * 输出：5
     * 解释：如果你选择 startValue = 4，在第三次累加时，和小于 1 。
     *                 累加求和
     *                 startValue = 4 | startValue = 5 | nums
     *                   (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
     *                   (1 +2 ) = 3  | (2 +2 ) = 4    |   2
     *                   (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
     *                   (0 +4 ) = 4  | (1 +4 ) = 5    |   4
     *                   (4 +2 ) = 6  | (5 +2 ) = 7    |   2
     * [-5,-2,4,4,-2]
     */
    public int minStartValue(int[] nums) {
        int result = 1, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum + result < 1){
                result = 1 + Math.abs(sum);
            }
        }
        return result;
    }
}
