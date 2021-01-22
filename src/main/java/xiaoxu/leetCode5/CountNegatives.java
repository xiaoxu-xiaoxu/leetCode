package xiaoxu.leetCode5;

/**
 * @author xx
 * @create 2021/1/19 13:13
 */
public class CountNegatives{

    /**
     * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
     * 请你统计并返回 grid 中 负数 的数目。
     * 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
     * 输出：8
     * 解释：矩阵中共有 8 个负数。
     */
    public int countNegatives(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = grid[i].length - 1; j >= 0; j--){
                if(grid[i][j] < 0){
                    ++res;
                    continue;
                }
                break;
            }
        }
        return res;
    }
}
