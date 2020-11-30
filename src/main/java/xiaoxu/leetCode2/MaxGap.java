package xiaoxu.leetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xx
 * @create 2020/11/26 11:25
 */
public class MaxGap{

    /**
     * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
     * 如果数组元素个数小于 2，则返回 0。
     * 输入: [3,6,9,1]
     * 输出: 3
     * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3
     * 输入: [10]
     * 输出: 0
     * 解释: 数组元素个数小于 2，因此返回 0。
     */
    public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int result = -1, temp = 0;
        for(int i = 0; i < nums.length - 1; i++){
            temp = nums[i + 1] - nums[i];
            if(temp >= result){
                result = temp;
            }
        }
        return result;
    }

}
