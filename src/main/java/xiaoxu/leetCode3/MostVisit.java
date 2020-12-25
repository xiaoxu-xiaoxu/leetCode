package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/24 13:13
 */
public class MostVisit{
    /**
     * 给你一个整数 n 和一个整数数组 rounds 。有一条圆形赛道由 n 个扇区组成，
     * 扇区编号从 1 到 n 。现将在这条赛道上举办一场马拉松比赛，该马拉松全程由 m 个阶段组成。
     * 其中，第 i 个阶段将会从扇区 rounds[i - 1] 开始，到扇区 rounds[i] 结束。
     * 举例来说，第 1 阶段从 rounds[0] 开始，到 rounds[1] 结束。
     * 请你以数组形式返回经过次数最多的那几个扇区，按扇区编号 升序 排列。
     * 注意，赛道按扇区编号升序逆时针形成一个圆
     * 输入：n = 4, rounds = [1,3,1,2]
     * 输出：[1,2]
     * 解释：本场马拉松比赛从扇区 1 开始。经过各个扇区的次序如下所示：
     * 1 --> 2 --> 3（阶段 1 结束）--> 4 --> 1（阶段 2 结束）--> 2（阶段 3 结束，即本场马拉松结束）
     * 其中，扇区 1 和 2 都经过了两次，它们是经过次数最多的两个扇区。扇区 3 和 4 都只经过了一次
     * 输入：n = 2, rounds = [2,1,2,1,2,1,2,1,2]
     * 输出：[2]
     * 输入：n = 7, rounds = [1,3,5,7]
     * 输出：[1,2,3,4,5,6,7]
     *
     * 1 2 3 4  int[]
     * 1 3   1 2 3
     * 3 1   4 1
     * 1 2   2
     * 由于马拉松全程只会按照同一个方向跑，中间不论跑了多少圈，
     * 对所有扇区的经过次数的贡献都是相同的。
     * 因此此题的答案仅与起点和终点相关。从起点沿着逆时针方向走
     * 到终点的这部分扇区，就是经过次数最多的扇区。
     * 3
     * [3,2,1,2,1,3,2,1,2,1,3,2,3,1]
     */
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> res = new ArrayList<>();
        int start = rounds[0], end = rounds[rounds.length - 1];
        if(start <= end){
            for(int i = start; i <= end; i++){
                res.add(i);
            }
        }else{
            for(int i = 1; i <= end; i++){
                res.add(i);
            }
            for(int i = start; i <= n; i++){
                res.add(i);
            }

        }
        return res;
    }

    @Test
    public void test(){
        int[] arr = {1,3,1,2};
        int[] arr1 = {2,1,2,1,2,1,2};
        List<Integer> integers = mostVisited(2, arr);
        System.out.println(integers);
    }

}
