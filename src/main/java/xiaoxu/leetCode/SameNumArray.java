package xiaoxu.leetCode;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/19 17:05
 */
public class SameNumArray{

    @Test
    public void test(){
        int[] arr = {99, 99};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }

    // 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
    // 使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
    // [1,0,1,1] 99 99
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || k < 1){
            return false;
        }
        boolean result;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    result = j - i <= k;
                    if(result)
                        return true;
                }
            }
        }
        return false;
    }

    //  1 2 3 1
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        if(nums == null || k < 1){
            return false;
        }
        for(int i = 0; i < nums.length - k; i++){
            if(nums[i] == nums[i + k]){
                for(int j = i + k + 1; j < nums.length; j++){
                    return !(nums[j] == nums[i]);
                }
            }
        }
        return false;
    }

}
