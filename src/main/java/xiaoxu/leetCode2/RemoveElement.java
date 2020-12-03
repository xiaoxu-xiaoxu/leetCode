package xiaoxu.leetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/3 16:04
 */
public class RemoveElement{


    /**
     * 给你一个数组 nums 和一个值 val，
     * 你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     */
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num == val){
                count++;
            }else{
                list.add(num);
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums.length - count;
    }
}
