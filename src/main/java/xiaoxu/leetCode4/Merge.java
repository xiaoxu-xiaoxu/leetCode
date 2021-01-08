package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/1/5 16:34
 */
public class Merge{

    @Test
    public void test(){
        int[] arr = {1,2,3,0,0,0};
        int[] arr1 = {2,5,6};
        merge(arr,3,arr1,3);
    }

    /**
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     * 初始化 A 和 B 的元素数量分别为 m 和 n。
     * 输入:
     * A = [1,2,3,0,0,0], m = 3
     * B = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     */
    public void merge(int[] A, int m, int[] B, int n) {
        int count = 0;
        for(int i = m; i < A.length; i++){
            A[i] = B[count++];
        }
        Arrays.sort(A);
    }

    public void merge1(int[] A, int m, int[] B, int n) {
        int pa = 0, pb = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (pa < m || pb < n) {
            if (pa == m) {
                cur = B[pb++];
            } else if (pb == n) {
                cur = A[pa++];
            } else if (A[pa] < B[pb]) {
                cur = A[pa++];
            } else {
                cur = B[pb++];
            }
            sorted[pa + pb - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            A[i] = sorted[i];
        }
    }


}
