package xiaoxu.leetCode;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2020/11/23 9:23
 */
public class SummaryRanges {

    @Test
    public void test(){
//        [-2,-1,1,2,2147483646,2147483647]
        int[] arr = {-2,-1,1,2,2147483646,2147483647};
        List<String> list = summaryRanges(arr);
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>();
        set.add(-2);
        set.add(-1);
        set.add(-3);
        System.out.println(new ArrayList<>(set));
    }

    /**
     * 给定一个无重复元素的有序整数数组 nums 。
     * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums
     * 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x
     * 输入：nums = [0,1,2,4,5,7]
     * 输出：["0->2","4->5","7"]
     * 解释：区间范围是：
     * [0,2] --> "0->2"
     * [4,5] --> "4->5"
     * [7,7] --> "7"
     */
    public List<String> summaryRanges(int[] nums) {
        if(nums == null){
            return null;
        }
        List<String> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            if(i != nums.length - 1 && nums[i] + 1 == nums[i + 1]){
                continue;
            }
            Object[] arr =  set.toArray();
            if(set.size() > 1){
                list.add(arr[0] + "->" + arr[arr.length - 1]);
            }else{
                list.add(arr[0] + "");
            }
            set.clear();
        }
        return list;
    }
}
