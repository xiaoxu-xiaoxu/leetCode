package xiaoxu.leetCode5;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/2/22 10:43
 */
public class TrimMean{

    /**
     * 给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
     * 与 标准答案 误差在 10-5 的结果都被视为正确结果。
     * 输入：arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
     * 输出：2.00000
     * 解释：删除数组中最大和最小的元素后，所有元素都等于 2，所以平均值为 2 。
     * 输入：arr = [6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0]
     * 输出：4.00000
     */
    public double trimMean(int[] arr) {
        double sum = 0, res = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= sum * 0.05 && arr[i] <= sum * 0.95){
                count++;
                res += arr[i];
            }
        }
        return res / count;
    }

    public double trimMean1(int[] arr) {
        Arrays.sort(arr);
        int geshu = (int) (arr.length * 0.05);
        double sum = 0;
        for (int i = geshu; i < arr.length - geshu; i++) {
            sum += arr[i];
        }
        double avg = sum / (arr.length - 2 * geshu);
        return avg;
    }

}
