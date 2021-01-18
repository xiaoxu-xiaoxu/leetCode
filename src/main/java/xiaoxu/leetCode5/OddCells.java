package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/1/18 10:04
 */
public class OddCells{

    @Test
    public void test(){
        int[][] arr = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, arr));
    }

    /**
     * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
     * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
     * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
     * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目
     * 输入：n = 2, m = 3, indices = [[0,1],[1,1]]
     * 输出：6
     * 解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
     * 第一次增量操作后得到 [[1,2,1],[0,1,0]]。
     * 最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数。
     * 0 0 0
     * 0 0 0
     *
     * 1 2 1
     * 0 1 0
     *
     * 1 3 1
     * 1 3 1
     *
     */
    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr = new int[n][m];
        int hang, lie, result = 0;
        for(int i = 0; i < indices.length; i++){
            hang = indices[i][0];
            lie = indices[i][1];
            for(int j = 0; j < m; j++){
                ++arr[hang][j];
            }
            for(int j = 0; j < n; j++){
                ++arr[j][lie];
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 != 0){
                    ++result;
                }
            }
        }
        return result;
    }
}
