package xiaoxu.leetCode;

/**
 * @author xx
 * @create 2020/11/19 13:55
 */
public class SumOfArrayQi{

    /**
     * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
     * 子数组 定义为原数组中的一个连续子序列。
     * 请你返回 arr 中 所有奇数长度子数组的和 。
     * 输入：arr = [1,4,2,5,3]
     * [1] = 1
     * [4] = 4
     * [2] = 2
     * [5] = 5
     * [3] = 3
     * [1,4,2] = 7
     * [4,2,5] = 11
     * [2,5,3] = 10
     * [1,4,2,5,3] = 15
     * 我们将所有值求和得到 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        for(int i = 1; i <= arr.length; i += 2){
            for(int j = 0; j + i <= arr.length; j++){
                for(int k = j; k < j + i; k++){
                    result += arr[k];
                }
            }
        }
        return result;
    }

}
