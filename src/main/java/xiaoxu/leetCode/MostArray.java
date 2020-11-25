package xiaoxu.leetCode;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2020/11/5 15:03
 */
public class MostArray{

    @Test
    public void test(){
        int[] arr = {2,2,2, 2,2,3,4,4};
        System.out.println(majorityElement1(arr));

    }


    // 找出数组中数量最多的一个元素
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int value : nums){
            set.add(value);
        }
        if(set.size() == 1){
            return nums[0];
        }
        for(Integer list : set){
            int count = 0;
            for(int num : nums){
                if(list == num){
                    count++;
                }
            }
            map.put(list, count);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        if(list.get(0).getValue().equals(list.get(1).getValue()) || list.get(0).getValue() <= nums.length / 2){
            return -1;
        }
        return list.get(0).getKey();
    }

    public int majorityElement1(int[] nums) {
        long l = System.currentTimeMillis();
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int arr : nums){
            if(map.containsKey(arr)){
                map.put(arr, map.get(arr) + 1);
            }else{
                map.put(arr, 1);
            }
        }
        if(map.size() == 1){
            return nums[0];
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        if(list.get(0).getValue().equals(list.get(1).getValue()) || list.get(0).getValue() <= nums.length / 2){
            return -1;
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        System.out.println("  234432222222222");
        return list.get(0).getKey();
    }
}
