package xiaoxu.leetCode;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/11/19 11:15
 */
public class SortSquares{

    // 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
    // 输入：[-4,-1,0,3,10]
    // 输出：[0,1,9,16,100]
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for(int i = 0; i < A.length; i++){
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result;
    }

    // [-4,-1,0,3,10]
    public int[] sortedSquares1(int[] A){
        if(A == null){
            return null;
        }
        int[] arr = new int[A.length];
        for(int i = 0, j = A.length - 1, k = A.length - 1; i <= j; k --){
            if(A[i] * A[i] > A[j] * A[j]){
                arr[k] = A[i] * A[i];
                i ++;
            }else{
                arr[k] = A[j] * A[j];
                j --;
            }
        }
        return arr;
    }
}
