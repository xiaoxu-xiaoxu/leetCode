package xiaoxu.leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xx
 * @create 2020/11/24 9:21
 */
public class MergeArray{

    @Test
    public void test(){
        int[] arr = {1};
        int[] arr2 = {2,5,6};
        merge(arr, 1, null, 0);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2
     * 合并到 nums1 中，使 nums1 成为一个有序数组。
     * 输入：
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 输出：[1,2,2,3,5,6]
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length){
            if(j < m && (k == n || nums1[j] <= nums2[k])){
                arr[i] = nums1[j];
                j++;
            }else if(k < n && (j == m || nums1[j] > nums2[k])){
                arr[i] = nums2[k];
                k++;
            }
            i++;
        }
        System.arraycopy(arr, 0, nums1, 0, arr.length);
    }
}
