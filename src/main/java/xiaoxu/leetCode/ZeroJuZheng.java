package xiaoxu.leetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author xx
 * @create 2020/11/10 14:00
 * 若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 */
public class ZeroJuZheng{

    @Test
    public void test(){

    }

    /**
     1 2 3 0
     2 0 5 1
     0 2 2 5
     */
    public static void setZeroes(int[][] matrix) {
        if(matrix == null){
            return;
        }
        HashSet<Integer> hang = new HashSet<>();
        HashSet<Integer> lie = new HashSet<>();
        for(int j = 0; j < matrix.length; j++){
            for(int i = 0; i < matrix[i].length; i++){
                if(matrix[j][i] == 0){
                    hang.add(j);
                    lie.add(i);
                }
            }
        }
        hang.forEach(hSet -> {
            Arrays.fill(matrix[hSet], 0);
        });
        lie.forEach(lSet -> {
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if(j == lSet){
                        matrix[i][j] = 0;
                    }
                }
            }
        });

    }
}






