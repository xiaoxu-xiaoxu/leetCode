package xiaoxu.leetCode2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xx
 * @create 2020/11/27 13:30
 */
public class FindShortArray{

    /**
     * 给定一个非空且只包含非负数的整数数组nums,
     * 数组的度的定义是指数组里任一元素出现频数的最大值
     * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度
     * 输入: [1, 2, 2, 3, 1]
     * 输出: 2
     * 输入数组的度是2，因为元素1和2的出现频数最大，均为2
     * 连续子数组里面拥有相同度的有如下所示:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * 最短连续子数组[2, 2]的长度为2，所以返回2.
     */
    public int findShortestSubArray(int[] nums) {
        if(nums == null){
            return -1;
        }
        Map<Integer, Integer> lIndex = new HashMap<>(), rIndex = new HashMap<>(),
                count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            lIndex.put(nums[i], i);
        }
        return -1;
    }
}
