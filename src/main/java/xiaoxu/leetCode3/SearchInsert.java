package xiaoxu.leetCode3;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/12/7 15:30
 */
public class SearchInsert{

    @Test
    public void test(){
        int[] arr = {1,3};
        System.out.println(searchInsert(arr, 3));
    }
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     * 输入: [1,3,5,6], 5
     * 输出: 2
     * 输入: [1,3,5,6], 2
     * 输出: 1
     */
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(target <= nums[0]){
            return 0;
        }
        if(target > nums[nums.length - 1]){
            return nums.length;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(target > nums[i] && nums[i + 1] >= target){
                return i + 1;
            }
        }
        return -1;
    }
}
