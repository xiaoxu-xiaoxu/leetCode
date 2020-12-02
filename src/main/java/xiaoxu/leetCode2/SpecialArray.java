package xiaoxu.leetCode2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xx
 * @create 2020/12/2 17:26
 */
public class SpecialArray{

    /**
     * 给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素
     * 大于或者等于 x ，那么就称 nums 是一个 特殊数组 ，而 x 是该数组的 特征值 。
     * 注意： x 不必 是 nums 的中的元素。
     * 如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回 -1 。
     * 可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的 。
     * 输入：nums = [3,5]
     * 输出：2
     * 解释：有 2 个元素（3 和 5）大于或等于 2
     */
    public int specialArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }

        return -1;
    }
}