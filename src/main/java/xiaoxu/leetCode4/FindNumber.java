package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xx
 * @create 2020/12/29 9:42
 */
public class FindNumber{

    @Test
    public void test(){
        int[] arr = {2,3,1,0,2,5,3};
        int repeatNumber = findRepeatNumber(arr);
        System.out.println(repeatNumber);
    }

    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
     * 请找出数组中任意一个重复的数字。
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return num;
            }
        }
        return -1;
    }


}
