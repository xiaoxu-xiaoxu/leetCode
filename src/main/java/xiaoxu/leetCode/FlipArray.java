package xiaoxu.leetCode;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/23 14:30
 */
public class FlipArray{

    @Test
    public void test(){
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
    }
    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]
     * 输入: [[1,1,0],[1,0,1],[0,0,0]]
     * 输出: [[1,0,0],[0,1,0],[1,1,1]]
     * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
     */
    public int[][] flipAndInvertImage(int[][] A) {
        if(A == null){
            return null;
        }
        int[][] B = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            int count = 0;
            for(int j = A[i].length -1; j >= 0; j--){
                B[i][count++] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return B;
    }
}
