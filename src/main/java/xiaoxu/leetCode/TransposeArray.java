package xiaoxu.leetCode;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author xx
 * @create 2020/11/5 14:21
 */
public class TransposeArray{

    @Test
    public void test(){
        int[][] arr = new int[][]{{1,2,3}, {4, 5, 6}};

        int[][] transpose = transpose(arr);

        for(int i = 0; i < transpose.length; i++){
            for(int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * 返回 1 4 7  2 5 8  3 6 9
     *
     * 1 2 3 (0,0) (0,1) (0,2)
     * 4 5 6 (1,0) (1,1) (1,2)
     * 返回 1 4  2 5  3 6
     *    (0,0) (0,1)
     *    (1,0) (1,1)
     *    (2,0) (2,1)
     */
    public int[][] transpose(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < A[0].length; i++){
            for(int j = 0; j < A.length; j++){
                list.add(A[j][i]);
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = list.get(count);
                count++;
            }
        }
        return arr;
    }

    public int[][] transpose1(int[][] A) {
        int c = A.length, r = A[0].length;

        int[][] B = new int[r][c];
        for(int i = 0; i < c; ++ i){
            for(int j = 0; j < r; ++ j){
                B[j][i] = A[i][j]; //B[i][j] = A[j][i] 会超出索引。
            }
        }
        return B;
    }
}
