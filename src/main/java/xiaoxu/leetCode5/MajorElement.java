package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xx
 * @create 2021/1/18 13:15
 */
public class MajorElement{

    @Test
    public void test(){
        int[] arr = {2,2,1,1,1,2,2};
        int[] arr1 = {3,3,2};
        System.out.println(majorityElement(arr1));
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于n/2的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * 输入：[3,2,3]
     * 输出：3
     * 输入：[2,2,1,1,1,2,2]
     * 输出：2
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entries){
            if(entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
