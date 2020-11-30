package xiaoxu.leetCode2;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/27 10:10
 */
public class SortArray{

    @Test
    public void test(){
        int[] arr = {4};
        change(arr);
        System.out.println(arr[0]);
    }

    /**
     * 给定一个非负整数数组A,A 中一半整数是奇数，一半整数是偶数。
     * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     * 你可以返回任何满足上述条件的数组作为答案。
     * 输入：[4,2,5,7]
     * 输出：[4,5,2,7]
     * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
     */
    public int[] sortArrayByParityII(int[] A) {
        if(A == null){
            return null;
        }
        int i = 0;
        while(i < A.length - 1){
            if(i % 2 == 1 && A[i] % 2 != 1){
                change(i, A, 1);
            }else if(i % 2 == 0 && A[i] % 2 != 0){
                change(i, A, 0);
            }
            i++;
        }
        return A;
    }

    public void change(int i, int[] A, int k){
        for(int j = i + 1; j < A.length; j++){
            if(A[j] % 2 == k){
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                break;
            }
        }
    }

    public void change(int[] arr){
        arr[0] = 2;
    }
}
