package xiaoxu.leetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author xx
 * @create 2020/11/9 9:47
 */
public class KClosest{

    public static void main(String[] args){
        int[][] arr = {{1, 3}, {3, 1}};
        int[][] result = kClosest(arr, 2);
        System.out.println(23);
    }

    /**
     * 输入：points = [[1,3],[-2,2]], K = 1
     * 输出：[[-2,2]]
     * 解释：
     * (1, 3) 和原点之间的距离为 sqrt(10)，
     * (-2, 2) 和原点之间的距离为 sqrt(8)，
     * 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
     * 我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
     */
    public static int[][] kClosest(int[][] points, int K) {
        int[] arr = new int[points.length];
        int[][] result = new int[K][2];
        int count = 0;
        for(int i = 0; i < points.length; i++){
            arr[count++] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        Arrays.sort(arr);
        count = 0;
        l: for(int j = 0; j < K; j++){
            for(int i = 0; i < points.length; i++){
                if(arr[j] == points[i][0] * points[i][0] + points[i][1] * points[i][1]){
                    if(count == 0){
                        result[j][0] = points[i][0];
                        result[j][1] = points[i][1];
                        count++;
                    }else{
                        for(int k = 0; k < count; k++){
                            if(result[k][0] != points[i][0] && result[k][1] != points[i][1]){
                                result[j][0] = points[i][0];
                                result[j][1] = points[i][1];
                                count++;
                                continue l;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public int[][] kClosest1(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }
}










