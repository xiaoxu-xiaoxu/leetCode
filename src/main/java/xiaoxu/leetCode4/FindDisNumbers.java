package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xx
 * @create 2021/1/15 13:15
 */
public class FindDisNumbers{

    @Test
    public void test(){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    /**
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，
     * 数组中的元素一些出现了两次，另一些只出现一次。
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     * 输入:
     * [4,3,2,7,8,2,3,1]
     * 输出:
     * [5,6]
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] table = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            table[nums[i]] = 1;
        }
        for(int i = 1; i < table.length; i++){
            if(table[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}
