package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2021/3/3 9:16
 */
public class ThirdMax{

    @Test
    public void test(){
        int[] arr = {2, 2, 3, 1};
        System.out.println(thirdMax(arr));
    }

    /**
     * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
     * 输入：[2, 2, 3, 1]
     * 输出：1
     * 解释：注意，要求返回第三大的数，是指第三大且唯一出现的数。
     * 存在两个值为2的数，它们都排第二。
     * 输入：[1, 2]
     * 输出：2
     * 解释：第三大的数不存在, 所以返回最大的数 2 。
     */
    public int thirdMax(int[] nums){
        Arrays.sort(nums);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = nums.length - 1, j = 0; i >= 0; i--){
            if(i != nums.length - 1 && nums[i + 1] == nums[i])
                continue;
            map.put(j++, nums[i]);
        }
        if(map.size() < 3)
            return map.get(0);
        return map.get(2);
    }
}
