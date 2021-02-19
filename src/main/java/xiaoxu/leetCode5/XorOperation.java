package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/2/19 15:54
 */
public class XorOperation{

    @Test
    public void test(){
        System.out.println(xorOperation(5, 0));
    }

    /**
     * 给你两个整数，n和start
     * 数组nums定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     * 请返回nums中所有元素按位异或（XOR）后得到的结果。
     * 输入：n = 5, start = 0
     * 输出：8
     * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
     * "^" 为按位异或 XOR 运算符。
     *
     */
    public int xorOperation(int n, int start) {
        int res = start, temp = start;
        for(int i = 1; i < n; i++){
            temp = start + 2 * i;
            res ^= temp;
        }
        return res;
    }
}
