package xiaoxu.leetCode2;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/26 14:59
 */
public class CheckLine{

    @Test
    public void test(){
        int[][] arr = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
        checkStraightLine(arr);
    }

    /**
     * 判断点是否构成一条直线
     * [[-4,-3],[1,0],[3,-1],[0,-1],[-5,2]]
     */
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates == null){
            return false;
        }
        if(coordinates.length == 2){
            return true;
        }
        double k, result = 0, count = 0, count1 = 0;
        for(int i = 0; i < coordinates.length - 1; i++){
            if(coordinates[i + 1][0] - coordinates[i][0] == 0){
                count++;
            }else{
                k = (double)(coordinates[i + 1][1] - coordinates[i][1]) / (coordinates[i + 1][0] - coordinates[i][0]);
                if(i == 0){
                    result = k;
                    count1++;
                }else if(result == k){
                    count1 ++;
                }
            }
        }
        return count > 0 ? count == coordinates.length -1 : count1 == coordinates.length - 1;
    }
}
