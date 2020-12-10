package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/10 16:39
 */
public class AddToArray{

    @Test
    public void test(){
        int[] arr = {1,2,0,0};
        List<Integer> integers = addToArrayForm(arr, 34);
    }

    /**
     * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组
     * 例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
     * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
     * 输入：A = [1,2,0,0], K = 34
     * 输出：[1,2,3,4]
     * 解释：1200 + 34 = 1234
     * 输入：A = [2,7,4], K = 181
     * 输出：[4,5,5]
     * 解释：274 + 181 = 455
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder builder = new StringBuilder();
        for(int i : A){
            builder.append(i);
        }
        String res = String.valueOf(Integer.parseInt(builder.toString()) + K);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < res.length(); i++){
            result.add(Integer.parseInt(res.substring(i, i + 1)));
        }
        return result;
    }
}
