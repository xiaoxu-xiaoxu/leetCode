package xiaoxu.leetCode2;

/**
 * @author xx
 * @create 2020/12/3 15:50
 */
public class FindMaxLength{

    /**
     * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
     * 输入：nums = [1,3,5,4,7]
     * 输出：3
     * 解释：最长连续递增序列是 [1,3,5], 长度为3。
     * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。
     */
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int result = 0, count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                count++;
            }else{
                result = Math.max(result, count);
                count = 1;
            }
        }
        return Math.max(result, count);
    }
}
