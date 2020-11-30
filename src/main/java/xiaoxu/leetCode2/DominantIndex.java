package xiaoxu.leetCode2;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2020/11/26 10:15
 */
public class DominantIndex{

    @Test
    public void test(){
        int[] arr = {0,0,0,1};
        dominantIndex1(arr);
    }

    /**
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * 如果是，则返回最大元素的索引，否则返回-1。
     * 输入: nums = [3, 6, 1, 0]
     * 输出: 1
     * 解释: 6是最大的整数, 对于数组中的其他整数,
     * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
     */
    public int dominantIndex1(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            l: for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue l;
                }
                if(nums[i] >= nums[j] * 2){
                    count ++;
                }
            }
            if(count == nums.length - 1){
                return i;
            }
        }
        return -1;
    }

    public int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int[] clone = nums.clone();
        Arrays.sort(clone);
        if(clone[clone.length - 1] >= clone[clone.length - 2] * 2){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == clone[clone.length - 1])
                    return i;
            }
        }
        return -1;
    }
}
