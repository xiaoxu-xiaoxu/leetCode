package xiaoxu.leetCode5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author xx
 * @create 2021/3/2 10:16
 */
public class FindMaxAvg{

    @Test
    public void test(){
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage1(arr, 4));
    }

    /**
     * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
     * 输入：[1,12,-5,-6,50,3], k = 4
     * 输出：12.75
     * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
     */
    public double findMaxAverage(int[] nums, int k) {
        double temp = 0, res = -10000000;
        for(int i = 0; i <= nums.length - k; i++){
            for(int j = i; j < i + k; j++){
                temp += nums[j];
            }
            if(res < temp)
                res = temp;
            temp = 0;
        }
        return res / k;
    }

    public double findMaxAverage1(int[] nums, int k){
        int temp1 = 0, temp;
        for(int i = 0; i < k; i++){
            temp1 += nums[i];
        }
        temp = temp1;
        for(int i = k; i < nums.length; i++){
            temp = temp - nums[i - k] + nums[i];
            temp1 = Math.max(temp, temp1);
        }
        return (double) temp1 / k;
    }
}
