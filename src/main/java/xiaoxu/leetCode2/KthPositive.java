package xiaoxu.leetCode2;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/26 13:13
 */
public class KthPositive{

    @Test
    public void test(){
        int[] arr = {2,3,4,7,11};
        int kthPositive = findKthPositive(arr, 5);
        System.out.println(kthPositive);
    }
    /**
     * 给你一个严格升序排列的正整数数组arr和一个整数k
     * 请你找到这个数组里第 k 个缺失的正整数
     * 输入：arr = [2,3,4,7,11], k = 5
     * 输出：9
     * 解释：缺失的正整数包括[1,5,6,8,9,10,12,13,...]第5个缺失的正整数为9
     * 输入：arr = [1,2,3,4], k = 2
     * 输出：6
     * 解释：缺失的正整数包括[5,6,7,...]第2个缺失的正整数为6
     */
    public int findKthPositive(int[] arr, int k) {
        if(arr == null){
            return -1;
        }
        int i = 1, j = 0, count = 0;
        while(i < 2001){
            if(j < arr.length && arr[j] == i){
                j++;
            }else{
                count++;
            }
            if(count == k){
                return i;
            }
            i++;
        }
        return -1;
    }
}
