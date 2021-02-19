package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/2/4 9:30
 */
public class ThreePartEqualSum{

    @Test
    public void test(){
        //[1,-1,1,-1]
        int[] arr = {1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(arr));
    }

    /**
     * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
     * 形式上，如果可以找出索引 i+1 < j 且满足 A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2]
     * + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。
     * 输入：[0,2,1,-6,6,-7,9,1,2,0,1]
     * 输出：true
     * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
     * 输入：[0,2,1,-6,6,7,9,-1,2,0,1]
     * 输出：false
     * 输入：[3,3,6,5,-2,2,5,1,-9,4]
     * 输出：true
     * 解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
     */
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if(sum % 3 != 0)
            return false;
        int lIndex = 0, temp = 0, rIndex = 0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
            if(temp == sum / 3){
                lIndex = i;
                break;
            }
        }
        temp = 0;
        for(int i = lIndex + 1; i < arr.length; i++){
            temp += arr[i];
            if(temp == sum / 3){
                rIndex = i;
                break;
            }
        }
        return rIndex != 0 && rIndex < arr.length - 1;
    }
}
