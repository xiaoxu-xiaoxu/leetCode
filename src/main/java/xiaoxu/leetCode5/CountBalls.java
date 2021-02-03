package xiaoxu.leetCode5;

import org.junit.Test;

/**
 * @author xx
 * @create 2021/2/1 13:34
 */
public class CountBalls{

    @Test
    public void test(){
        System.out.println(countBalls(1, 1));
    }

    /**
     * 你在一家生产小球的玩具厂工作，有 n 个小球，编号从 lowLimit 开始，到 highLimit 结束
     * （包括 lowLimit 和 highLimit ，即 n == highLimit - lowLimit + 1）。
     * 另有无限数量的盒子，编号从 1 到 infinity 。
     * 你的工作是将每个小球放入盒子中，其中盒子的编号应当等于小球编号上每位数字的和。
     * 例如，编号 321 的小球应当放入编号 3 + 2 + 1 = 6 的盒子，而编号 10 的小球应当放入编号 1 + 0 = 1 的盒子。
     * 给你两个整数 lowLimit 和 highLimit ，返回放有最多小球的盒子中的小球数量。
     * 如果有多个盒子都满足放有最多小球，只需返回其中任一盒子的小球数量。
     * 输入：lowLimit = 1, highLimit = 10
     * 输出：2
     * 盒子编号：1 2 3 4 5 6 7 8 9 10 11 ...
     * 小球数量：2 1 1 1 1 1 1 1 1 0  0  ...
     * 编号 1 的盒子放有最多小球，小球数量为 2 。
     *
     */
    public int countBalls(int lowLimit, int highLimit) {
        int[] table = new int[55];
        int index, temp, res = 0;
        for(int i = lowLimit; i <= highLimit; i++){
            if(i < 10)
                table[i]++;
            else{
                index = 0;
                temp = i;
                while(temp > 0){
                    index += temp % 10;
                    temp /= 10;
                }
                table[index]++;
            }
        }
        for(int i = 0; i < table.length; i++){
            res = Math.max(table[i], res);
        }
        return res;
    }
}
