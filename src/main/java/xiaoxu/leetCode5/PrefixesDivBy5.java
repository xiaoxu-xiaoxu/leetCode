package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2021/2/4 10:04
 */
public class PrefixesDivBy5{

    @Test
    public void test(){
        // 1 0 1 1
        System.out.println(10 % 4);
        System.out.println(101 % 4);
        System.out.println(1011 % 4);
        int[] arr = {1,1,1,0,1};
        System.out.println(prefixesDivBy5(arr));
    }

    // 5  1 0 1
    // 10 1 0 1 0
    // 15 1 1 1 1
    // 20 1 0 1 0 0

    /**
     * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组
     * 被解释为一个二进制数（从最高有效位到最低有效位）。
     * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
     * 输入：[0,1,1]
     * 输出：[true,false,false]
     * 解释：
     * 输入数字为 0, 01, 011；也就是十进制中的 0, 1, 3 。只有第一个数可以被 5 整除，因此 answer[0] 为真。
     * 输入：[1,1,1]
     * 输出：[false,false,false]
     * 输入：[1,1,1,0,1]
     * 输出：[false,false,false,false,false]
     * 1 3 7 15
     */
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            int flg = (A[i] * (1 << i) + A[i]) % 5;
            res.add(flg == 0);
        }
        return res;
    }

}
