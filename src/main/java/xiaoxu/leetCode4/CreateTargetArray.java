package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2021/1/8 14:06
 */
public class CreateTargetArray{

    @Test
    public void test(){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] targetArray = createTargetArray(nums, index);
        System.out.println(Arrays.toString(targetArray));
    }

    /**
     * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
     * 目标数组 target 最初为空。
     * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
     * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
     * 请你返回目标数组。
     * 题目保证数字插入位置总是存在
     *
     * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
     * 输出：[0,4,1,3,2]
     * 解释：
     * nums       index     target
     * 0            0        [0]
     * 1            1        [0,1]
     * 2            2        [0,1,2]
     * 3            2        [0,1,3,2]
     * 4            1        [0,4,1,3,2]
     *
     * 输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
     * 输出：[0,1,2,3,4]
     * 解释：
     * nums       index     target
     * 1            0        [1]
     * 2            1        [1,2]
     * 3            2        [1,2,3]
     * 4            3        [1,2,3,4]
     * 0            0        [0,1,2,3,4]
     *
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < index.length; i++){
            ListIterator<Integer> iterator = list.listIterator(index[i]);
            iterator.add(nums[i]);
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
