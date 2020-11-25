package xiaoxu.leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xx
 * @create 2020/11/23 14:54
 */
public class Tictoctoe{

    @Test
    public void test(){
        int[][] arr = {{1,2}};
        System.out.println(Arrays.toString(arr[0]).equals("[1, 2]"));
    }

    /**
     * A 和 B 在一个 3 x 3 的网格上玩井字棋。
     * 井字棋游戏的规则如下：
     * 玩家轮流将棋子放在空方格 (" ") 上。
     * 第一个玩家 A 总是用 "X" 作为棋子，而第二个玩家 B 总是用 "O" 作为棋子。
     * "X" 和 "O" 只能放在空方格中，而不能放在已经被占用的方格上。
     * 只要有 3 个相同的（非空）棋子排成一条直线（行、列、对角线）时，游戏结束。
     * 如果所有方块都放满棋子（不为空），游戏也会结束。
     * 游戏结束后，棋子无法再进行任何移动。
     * 给你一个数组 moves，其中每个元素是大小为 2 的另一个数组（元素分别对应网格的行和列），
     * 它按照 A 和 B 的行动顺序（先 A 后 B）记录了两人各自的棋子位置。
     * 如果游戏存在获胜者（A 或 B），就返回该游戏的获胜者；如果游戏以平局结束，
     * 则返回 "Draw"；如果仍会有行动（游戏未结束），则返回 "Pending"。
     * 你可以假设 moves 都 有效（遵循井字棋规则），网格最初是空的，A 将先行动。
     *
     * 输入：moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
     * 输出："A"
     */
    public String tictactoe(int[][] moves) {
        int i = 0;
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        int[][] ints = initInt();
        while(i < moves.length -1){
            if(i % 2 == 0){
                a.add(ints[moves[i][0]][moves[i][1]] + "");
            }else{
                b.add(ints[moves[i][0]][moves[i][1]] + "");
            }
            if(a.size() > 2){
                Boolean a1 = judge(a);
                Boolean a2 = judge(b);
                if(a1){
                    return "A";
                }else if(a2){
                    return "B";
                }
            }
            i++;
        }
        return moves.length > 4 ? "Draw" : "Pending";
    }

    private Boolean judge(ArrayList<String> a){
        if(a.size() < 3){
            return false;
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("012");
        list.add("036");
        list.add("048");
        list.add("345");
        list.add("678");
        list.add("147");
        list.add("258");
        list.add("246");

        return false;
    }

    public int[][] initInt(){
        int[][] arr = new int[3][3];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        return arr;
    }
}
