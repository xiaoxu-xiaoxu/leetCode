package xiaoxu.leetCode2;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/30 17:30
 */
public class PivoIndex{

    @Test
    public void test(){
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }

    /**
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
     * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     * nums = [1, 7, 3, 6, 5, 6]
     * [-1,-1,-1,-1,-1,0]
     */
    public int pivotIndex(int[] nums) {
        int sum = 0, lSum = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(lSum == sum - nums[i]){
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}
