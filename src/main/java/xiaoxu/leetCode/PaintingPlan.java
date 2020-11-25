package xiaoxu.leetCode;

/**
 * @author xx
 * @create 2020/11/11 13:34
 */
public class PaintingPlan{

    /**
     * 画板上有 n * n 的网格。绘画规则为，小扣可以选择任意多行以及任意多列的格
     * 子涂成黑色，所选行数、列数均可为 0。
     * 小扣希望最终的成品上需要有 k 个黑色格子，请返回小扣共有多少种涂色方案。
     * 注意：两个方案中任意一个相同位置的格子颜色不同，就视为不同的方案。
     *
     * 2 * 2    2 3 4
     * 3 * 3    3 5 7 9
     * 4 * 4    4 7 10 13 16
     * 5 * 5    5 9 13 17 21 25
     * 6 * 6    6 11 16 21 26 32 36
     */
    public int paintingPlan(int n, int k) {
        if((k - n) % (n - 1) == 0){
            int hang = n,lie = n;
            return 0;
        }else{
            return 0;
        }
    }
}









