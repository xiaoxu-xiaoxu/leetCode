package xiaoxu.leetCode4;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/12/29 11:01
 */
public class DiagonalSum{

    @Test
    public void test(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonalSum(arr));
    }

    /**
     * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
     * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
     * 输入：mat = [[1,2,3],
     *             [4,5,6],
     *             [7,8,9]]
     * 输出：25
     * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
     * 请注意，元素 mat[1][1] = 5 只会被计算一次。
     * [[7,3,1,9],[3,4,6,9],[6,9,6,6],[9,5,8,5]]
     * 7 3 1 9
     * 3 4 6 9
     * 6 9 6 6
     * 9 5 8 5
     */
    public int diagonalSum(int[][] mat) {
        if(mat.length == 1){
            return mat[0][0];
        }
        int sum = 0;
        for(int i = 0, j = 0; i < mat[0].length; j++,i++){
            sum += mat[i][j];
        }
        for(int i = 0, j = mat.length - 1; i < mat[0].length; i++,j--){
            sum += mat[i][j];
        }
        sum = mat.length % 2 == 0 ? sum : sum - mat[mat.length / 2][mat.length / 2];
        return sum;
    }
}
