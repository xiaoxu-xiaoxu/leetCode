package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author xx
 * @create 2021/2/22 10:29
 */
public class SumOfUnique{

    @Test
    public void test(){

    }

    /**
     * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
     * 请你返回 nums 中唯一元素的 和 。
     * 输入：nums = [1,2,3,2]
     * 输出：4
     * 解释：唯一元素为 [1,3] ，和为 4 。
     *
     */
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                res += entry.getKey();
        }
        return res;
    }
}
