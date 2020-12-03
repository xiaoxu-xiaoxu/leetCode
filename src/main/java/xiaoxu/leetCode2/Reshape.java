package xiaoxu.leetCode2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/3 16:22
 */
public class Reshape{

    @Test
    public void test(){
        int[][] arr = {{1,2},{3,4}};
        matrixReshape1(arr,1,4);
    }

    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        if(nums[0].length * nums.length < r * c){
            return nums;
        }
        int[][] result = new int[r][c];
        int ro = 0, co = 0;
        for(int[] arr : nums){
            for(int a : arr){
                if(ro < r){
                    result[ro][co++] = a;
                    if(co == c){
                        ro++;
                        co = 0;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
     * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
     * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
     * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
     * 输入:
     * nums =
     * [[1,2],
     *  [3,4]]
     * r = 1, c = 4
     * 输出:
     * [[1,2,3,4]]
     * 解释:
     * 行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums[0].length * nums.length < r * c){
            return nums;
        }
        int[][] result = new int[r][c];
        List<Integer> list = new ArrayList<>();
        for(int[] arr : nums){
            for(int a : arr){
                list.add(a);
            }
        }
        int count = 0;
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = list.get(count++);
            }
        }
        return result;
    }
}
