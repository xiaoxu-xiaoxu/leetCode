package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/1/25 9:45
 */
public class SortArrayByParity{

    @Test
    public void test(){
        int[] arr = {3,1,3,2,4,6};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    /**
     * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
     * 你可以返回满足此条件的任何数组作为答案。
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     */
    public int[] sortArrayByParity(int[] A) {
        int temp;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] % 2 == 0)
                continue;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] % 2 == 0){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    break;
                }
            }
        }
        return A;
    }
}
