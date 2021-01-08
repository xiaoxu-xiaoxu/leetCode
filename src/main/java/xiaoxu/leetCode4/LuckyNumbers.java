package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2021/1/8 13:31
 */
public class LuckyNumbers{

    @Test
    public void test(){
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] arr1 = {{55103,18179,79062,46542}};
        System.out.println(luckyNumbers(arr1));
    }

    /**
     * 给你一个 m * n 的矩阵，矩阵中的数字各不相同 。请你按任意顺序返回矩阵中的所有幸运数。
     * 幸运数是指矩阵中满足同时下列两个条件的元素：
     * 在同一行的所有元素中最小
     * 在同一列的所有元素中最大
     * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
     * 输出：[15]
     * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
     * 3  7  8
     * 9  11 13
     * 15 16 17
     */
    //[[36376,85652,21002,4510],
    // [68246,64237,42962,9974],
    // [32768,97721,47338,5841],
    // [55103,18179,79062,46542]]
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int rowMin = matrix[i][0], index = 0;
            boolean flag = true;
            for(int j = 0; j < matrix[i].length - 1; j++){
                if(rowMin > matrix[i][j + 1]){
                    rowMin = matrix[i][j + 1];
                    index = j + 1;
                }
            }

            for(int j = 0; j < matrix.length; j++){
                if(rowMin < matrix[j][index]){
                    flag = false;
                    break;
                }
            }
            if(flag)
                list.add(rowMin);
        }
        return list;
    }
}
