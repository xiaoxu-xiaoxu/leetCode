package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author xx
 * @create 2021/1/12 10:15
 */
public class CountGroup{

    @Test
    public void test(){
        int i = countLargestGroup(15);
        System.out.println(i);
    }

    /**
     * 给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加）
     * ，然后把数位和相等的数字放到同一个组中。
     * 请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个。
     * 输入：n = 13
     * 输出：4
     * 解释：总共有 9 个组，将 1 到 13 按数位求和后这些组分别是：
     * [1,10]，[2,11]，[3,12]，[4,13]，[5]，[6]，[7]，[8]，[9]。总共有 4 个组拥有的数字并列最多。
     * 输入：n = 2
     * 输出：2
     * 解释：总共有 2 个大小为 1 的组 [1]，[2]。
     * 输入：n = 15
     * 输出：6
     * 对于 [1, n][1,n] 中的每一个整数 ii，我们可以计算出它的数位和 s_is i​
     * 建立一个从数位和到原数字的哈希映射，对每一个数字 ii，使键 s_is i​
     * 对应的值自增一。然后我们在值的集合中找到最大的值 mm，再遍历哈希表，统计值为 mm 的个数即可。
     */
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp, sum = 0, result = 0, max = 0;
        for(int i = 1; i <= n; i++){
            temp = i;
            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(map.get(sum), max);
            sum = 0;
        }
        for(Integer value : map.values()){
            if(max == value)
                result++;
        }
        return result;
    }

    public int countLargestGroup1(int n) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int maxValue = 0;
        for (int i = 1; i <= n; ++i) {
            int key = 0, i0 = i;
            while (i0 != 0) {
                key += i0 % 10;
                i0 /= 10;
            }
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, hashMap.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvpair : hashMap.entrySet()) {
            if (kvpair.getValue() == maxValue) {
                ++count;
            }
        }
        return count;
    }


}
