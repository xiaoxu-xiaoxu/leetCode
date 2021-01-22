package xiaoxu.leetCode5;

/**
 * @author xx
 * @create 2021/1/19 14:21
 */
public class IsMonotonic{

    /**
     * 如果数组是单调递增或单调递减的，那么它是单调的。
     * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。
     * 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
     * 当给定的数组 A 是单调数组时返回 true，否则返回 false
     * 输入：[1,2,2,3]
     * 输出：true
     * 输入：[6,5,4,4]
     * 输出：true
     */
    public boolean isMonotonic(int[] A) {
        int count = 0;
        for(int i = 0; i < A.length - 1; i++){

        }
        return false;
    }

    public boolean isMonotonic1(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i+1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }

        return true;
    }

}
