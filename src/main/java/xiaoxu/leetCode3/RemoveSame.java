package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/7 13:21
 */
public class RemoveSame{

    @Test
    public void test(){
        int[] arr = {1,1,2};
        removeDuplicates(arr);
    }

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                list.add(nums[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
