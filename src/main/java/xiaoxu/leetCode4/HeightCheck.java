package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/1/8 10:08
 */
public class HeightCheck{

    @Test
    public void test(){
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker1(arr));
    }

    /**
     * 输入：heights = [1,1,4,2,1,3]
     * 输出：3
     * 解释：
     * 当前数组：[1,1,4,2,1,3]
     * 目标数组：[1,1,1,2,3,4]
     * 在下标 2 处（从 0 开始计数）出现 4 vs 1 ，所以我们必须移动这名学生。
     * 在下标 4 处（从 0 开始计数）出现 1 vs 3 ，所以我们必须移动这名学生。
     * 在下标 5 处（从 0 开始计数）出现 3 vs 4 ，所以我们必须移动这名学生。
     * 输入：heights = [5,1,2,3,4]
     * 输出：5
     * 输入：heights = [1,2,3,4,5]
     * 输出：0
     */
    public int heightChecker(int[] heights) {
        int[] clone = heights.clone();
        Arrays.sort(clone);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(clone[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public int heightChecker1(int[] heights) {
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }

}
