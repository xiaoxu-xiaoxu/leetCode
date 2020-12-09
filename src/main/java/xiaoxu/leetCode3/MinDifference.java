package xiaoxu.leetCode3;

import java.util.*;

/**
 * @author xx
 * @create 2020/12/8 15:49
 */
public class MinDifference{



    public List<List<Integer>> min(int[] arr){
        Arrays.sort(arr);
        int minDec = arr[1] - arr[0], temp = 0;
        for(int i = 1; i < arr.length - 1; i++){
            temp = arr[i + 1] - arr[i];
            minDec = Math.min(minDec, temp);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == minDec){
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }

    /**
     * 给你个整数数组 arr，其中每个元素都 不相同。
     * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
     * 输入：arr = [4,2,1,3]
     * 输出：[[1,2],[2,3],[3,4]]
     * 输入：arr = [3,8,-10,23,19,-4,-14,27]
     * 输出：[[-14,-10],[19,23],[23,27]]
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr){
        Arrays.sort(arr);
        int minDec = arr[1] - arr[0], temp = 0;
        for(int i = 1; i < arr.length - 1; i++){
            temp = arr[i + 1] - arr[i];
            minDec = Math.min(minDec, temp);
        }
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int a : arr){
            set.add(a);
        }
        for(int a : arr){
            if(set.contains(minDec + a)){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(a);
                tempList.add(a + minDec);
                list.add(tempList);
            }
        }
        return list;
    }

}
