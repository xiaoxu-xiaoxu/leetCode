package xiaoxu.leetCode3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xx
 * @create 2020/12/7 15:55
 */
public class CheckIfExist{

    /**
     * 给你一个整数数组arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。
     * 更正式地，检查是否存在两个下标 i 和 j 满足：
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     * 输入：arr = [10,2,5,3]  2 5 10 3
     * 输出：true
     * 解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
     */
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(2 * i) || (i % 2 == 0 && set.contains(i / 2))){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
