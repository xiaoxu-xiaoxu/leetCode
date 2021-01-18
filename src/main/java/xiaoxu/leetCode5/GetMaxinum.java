package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/1/18 9:10
 */
public class GetMaxinum{

    @Test
    public void test(){
        System.out.println(getMaximumGenerated(3));
    }

    /**
     * 给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
     * nums[0] = 0
     * nums[1] = 1
     * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
     * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
     * 返回生成数组 nums 中的 最大 值。
     * 输入：n = 7
     * 输出：3
     * 解释：根据规则：
     *   nums[0] = 0
     *   nums[1] = 1
     *   nums[(1 * 2) = 2] = nums[1] = 1
     *   nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
     *   nums[(2 * 2) = 4] = nums[2] = 1
     *   nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
     *   nums[(3 * 2) = 6] = nums[3] = 2
     *   nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
     * 因此，nums = [0,1,1,2,1,3,2,3]，最大值 3
     *
     */
    public int getMaximumGenerated(int n) {
        if(n <= 1){
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int index, max = 1;
        for(int i = 1,j = 2; j <= n; j++){
            index = j % 2 == 0 ? i * 2 : i * 2 + 1;
            if(index <= n){
                arr[index] = index % 2 == 0 ? arr[i] : arr[i] + arr[i + 1];
                max = Math.max(max, arr[index]);
            }
            i = j % 2 == 0 ? i : i + 1;
        }
        return max;
    }
}
