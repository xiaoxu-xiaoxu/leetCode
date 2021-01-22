package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xx
 * @create 2021/1/19 13:30
 */
public class FrequencySort{

    @Test
    public void test(){
        int[] arr = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }

    /**
     * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。
     * 如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
     * 请你返回排序后的数组。
     * 输入：nums = [1,1,2,2,2,3]
     * 输出：[3,1,1,2,2,2]
     * 解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。
     * 输入：nums = [2,3,1,3,2]
     * 输出：[1,3,3,2,2]
     * 解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。
     */
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        Set<Map.Entry<Integer, Integer>> set1 = set.stream()
                .sorted(((o1, o2) -> {
                    if(!o1.getValue().equals(o2.getValue())){
                        return o1.getValue() - o2.getValue();
                    }else{
                        return o2.getKey() - o1.getKey();
                    }
                }))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        for(Map.Entry<Integer, Integer> entry : set1){
            for(int i = 0; i < entry.getValue(); i++){
                nums[index++] = entry.getKey();
            }
        }
        return nums;
    }
}
