package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(integers);
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
    // [9,9,9,9,9,9,9,9,10,0]
    public List<Integer> addToArrayForm(int[] A, int K) {
        String s = String.valueOf(K);
        int[] a = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        int[] max,min;
        max = a.length >= A.length ? a : A;
        min = a.length >= A.length ? A : a;
        List<Integer> res = new ArrayList<>(max.length + 1);

        int index = max.length - 1, high = 0;
        for(int i = min.length - 1; i >= 0; i--){
            int temp = min[i] + max[index--] + high;
            int ac = temp == 10 ? 0 : temp % 10;
            res.add(ac);
            if(temp / 10 == 0){
                high = 0;
                continue;
            }
            high = temp / 10;
        }
        if(high == 1 && min.length == max.length){
            res.add(high);
            high = 0;
        }
        for(int i = max.length - min.length - 1; i >= 0; i--){
            if(high != 0){
                int c = max[i] + high;
                int ac = c == 10 ? 0 : c % 10;
                res.add(ac);
                if(c / 10 == 0){
                    high = 0;
                    continue;
                }
                high = c / 10;
            }else{
                res.add(max[i]);
            }
        }
        if(high == 1){
            res.add(high);
        }

        Collections.reverse(res);
        return res;
    }
}
