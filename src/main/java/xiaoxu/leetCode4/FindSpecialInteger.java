package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/1/12 11:30
 */
public class FindSpecialInteger{

    @Test
    public void test(){
        //System.out.println(9 * (1.0 / 4));
        int[] arr = {1,2,2,6,6,6,6,7,10};
        int[] arr1 = {1};
        int[] arr2 = {1,2,3,3};
        System.out.println(findSpecialInteger(arr));
    }

    /**
     * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
     * 请你找到并返回这个整数
     * 输入：arr = [1,2,2,6,6,6,6,7,10]
     * 输出：6
     */
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        double line = arr.length * (1.0 / 4);
        int count = 1, temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(temp == arr[i]){
                count++;
                if(count > line){
                    return temp;
                }
                continue;
            }
            count = 1;
            temp = arr[i];

        }
        return -1;
    }
}
