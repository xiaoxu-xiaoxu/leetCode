package xiaoxu.leetCode2;

/**
 * @author xx
 * @create 2020/11/26 11:01
 */
public class Fib{
    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列
     * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 给定 N，计算 F(N)。
     * 输入：2
     * 输出：1
     * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
     * 输入：3
     * 输出：2
     * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
     */
    public int fib(int N) {
        int[] arr = new int[N + 1];
        for(int i = 0; i < arr.length; i ++){
            if(i < 2){
                arr[i] = i;
            }else{
                int res = 0;
                for(int j = i - 2; j < i; j++){
                    res += arr[j];
                }
                arr[i] = res;
            }
        }
        return arr[N];
    }
}
