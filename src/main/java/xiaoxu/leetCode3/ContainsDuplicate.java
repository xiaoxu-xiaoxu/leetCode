package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xx
 * @create 2020/12/28 13:50
 */
public class ContainsDuplicate{

    @Test
    public void test(){
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    /**
     * 给定一个整数数组，判断是否存在重复元素。
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
     * 输入: [1,2,3,1]
     * 输出: true
     * 输入: [1,2,3,4]
     * 输出: false
     */
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
