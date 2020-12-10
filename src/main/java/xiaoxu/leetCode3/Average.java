package xiaoxu.leetCode3;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/10 16:13
 */
public class Average{

    /**
     * 给你一个整数数组salary，数组里每个数都是唯一的，其中salary[i]是第i个员工的工资。
     * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
     */
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for(int i = 1; i < salary.length - 1; i++){
            sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}
