package xiaoxu.leetCode;

import org.junit.Test;

import java.util.*;

/**
 * @author xx
 * @create 2020/11/6 15:49
 */
public class BinaryOneSort{

    @Test
    public void test(){
        int[] arr = {0,1,2,3,4,5,6,7,8};
        sortByBits(arr);
    }

    public int returnOneCount(int num){
//        if(num < 0){
//            System.out.println("数大于等于0");
//            return -1;
//        }
        int count = 0;
        while(num > 0){
            count += num % 2;
            num /= 2;
        }
        return count;
    }

    /**
     * 输入：arr = [0,1,2,3,4,5,6,7,8]
     * 输出：[0,1,2,4,8,3,5,6,7]
     * 解释：[0] 是唯一一个有 0 个 1 的数。
     * [1,2,4,8] 都有 1 个 1 。
     * [3,5,6] 有 2 个 1 。
     * [7] 有 3 个 1 。
     * 按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
     */
    public int[] sortByBits(int[] arr) {

        for(int num : arr){
            int count = returnOneCount(num);

        }

        return null;
    }


    public int[] sortByBits1(int[] arr) {
        int[] bit = new int[10001];
        List<Integer> list = new ArrayList<Integer>();
        for (int x : arr) {
            list.add(x);
            bit[x] = get(x);
        }
        list.sort(new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                if(bit[x] != bit[y]){
                    return bit[x] - bit[y];
                }else{
                    return x - y;
                }
            }
        });
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 2;
            x /= 2;
        }
        return res;
    }


}
