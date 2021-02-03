package xiaoxu.leetCode5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author xx
 * @create 2021/2/3 10:43
 */
public class HasGroupSize{

    @Test
    public void test(){
        int[] arr = {1};
        System.out.println(hasGroupsSizeX(arr));
    }

    /**
     * 给定一副牌，每张牌上都写着一个整数。
     * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     * 每组都有 X 张牌。
     * 组内所有的牌上都写着相同的整数。
     * 仅当你可选的 X >= 2 时返回 true。
     * 输入：[1,2,3,4,4,3,2,1]
     * 输出：true
     * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
     * 输入：[1,1,1,2,2,2,3,3]
     * 输出：false
     * 解释：没有满足要求的分组。
     */
    public boolean hasGroupsSizeX(int[] deck) {
        int[] table = new int[10001];
        for(int i = 0; i < deck.length; i++){
            table[deck[i]]++;
        }

        return true;
    }
    // 2 4 8
    // 求两个数的最大公约数
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
