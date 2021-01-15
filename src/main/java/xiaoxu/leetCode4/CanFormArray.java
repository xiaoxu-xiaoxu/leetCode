package xiaoxu.leetCode4;

import java.util.HashMap;

/**
 * @author xx
 * @create 2021/1/14 16:00
 */
public class CanFormArray{

    /**
     * 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组
     * pieces，其中的整数也 互不相同 。请你以 任意顺序 连接 pieces 中的数组以形成 arr 。
     * 但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
     * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
     * 输入：arr = [85], pieces = [[85]]
     * 输出：true
     * 输入：arr = [15,88], pieces = [[88],[15]]
     * 输出：true
     * 解释：依次连接 [15] 和 [88]
     * 输入：arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
     * 输出：true
     * 解释：依次连接 [91]、[4,64] 和 [78]
     *
     */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        return false;
    }

    public boolean canFormArray1(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<pieces.length; i++){
            map.put(pieces[i][0], i);
        }
        for(int i=0; i<arr.length;){
            if(!map.containsKey(arr[i])) return false;
            int[] piece = pieces[map.get(arr[i])];
            for(int j=0; j<piece.length; i++, j++){
                if(arr[i]!=piece[j]) return false;
            }
        }
        return true;
    }

}
