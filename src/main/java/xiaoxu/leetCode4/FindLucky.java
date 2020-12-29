package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xx
 * @create 2020/12/29 13:13
 */
public class FindLucky{

    @Test
    public void test(){
        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }

    /**
     * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
     * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
     * 如果数组中存在多个幸运数，只需返回 最大 的那个。
     * 如果数组中不含幸运数，则返回 -1
     * 输入：arr = [2,2,3,4]
     * 输出：2
     * 解释：数组中唯一的幸运数是 2 ，因为数值 2 的出现频次也是 2
     * 输入：arr = [1,2,2,3,3,3]
     * 输出：3
     * 解释：1、2以及3都是幸运数，只需要返回其中最大的3
     */
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--){
            if(map.get(arr[i]) == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public int findLucky1(int[] arr) {
        final int[] nums = new int[501];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]] = nums[arr[i]] + 1;
        }
        for (int i = 500; i >= 1; i--) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
