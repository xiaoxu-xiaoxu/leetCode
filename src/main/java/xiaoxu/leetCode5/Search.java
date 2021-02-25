package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/2/25 11:37
 */
public class Search{

    @Test
    public void test(){
        int[] arr = {5,7,7,8,8,10};
        System.out.println(search(arr, 8));
    }

    public int search1(int[] nums, int target){

        return -1;
    }

    // 统计一个数字在排序数组中出现的次数。
    // 输入: nums = [5,7,7,8,8,10], target = 8
    // 输出: 2
    public int search(int[] nums, int target) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                res++;
            }
        }
        return res;
    }

    public int search2(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }

        return binarySearch(nums, target + 1) - binarySearch(nums, target);
    }

    private int binarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
            if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return leftIndex;
    }

}
