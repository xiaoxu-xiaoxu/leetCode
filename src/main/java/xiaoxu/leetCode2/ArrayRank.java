package xiaoxu.leetCode2;

import java.util.*;

/**
 * @author xx
 * @create 2020/11/24 11:37
 */
public class ArrayRank{

    /**
     * 给你一个整数数组arr请你将数组中的每个元素替换为它们排序后的序号。
     * 序号代表了一个元素有多大。序号编号的规则如下
     * 序号从1开始编号
     * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
     * 每个数字的序号都应该尽可能地小
     * 输入：arr=[40,10,20,30]
     * 输出：[4,1,2,3]
     * 输入：arr=[100,100,100]
     * 输出：[1,1,1]
     */
    public int[] arrayRankTransform(int[] arr) {
        if(arr == null){
            return null;
        }
        // 调用clone()方法复制数组
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : clone){
            if(!map.containsKey(value)){
                map.put(value, ++count);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                arr[i] = map.get(arr[i]);
            }
        }
        return arr;
    }
}
