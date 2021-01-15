package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2021/1/14 9:59
 */
public class LargeGroups{

    @Test
    public void test(){
        System.out.println(largeGroupPositions("bbbb"));
    }

    /**
     * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
     * 例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb",
     * "xxxx", "z" 和 "yy" 这样的一些分组。
     * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组
     * 的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
     * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
     * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
     * 输入：s = "abbxxxxzzy"
     * 输出：[[3,6]]
     * 解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
     * 输入：s = "abc"
     * 输出：[]
     * 解释："a","b" 和 "c" 均不是符合要求的较大分组。
     * 输入：s = "abcdddeeeeaabbbcd"
     * 输出：[[3,5],[6,9],[12,14]]
     * 解释：较大分组为 "ddd", "eeee" 和 "bbb"
     * 输入：s = "aba"
     * 输出：[]
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        int count = 1;
        char temp = s.charAt(0);
        int start = 0, end = 0;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for(int i = 1; i < s.length(); i++){
            tempList = new ArrayList<>();
            if(temp == s.charAt(i)){
                count++;
                end = i;
            }else{
                if(count >= 3){
                    tempList.add(start);
                    tempList.add(end);
                    list.add(tempList);
                }
                temp = s.charAt(i);
                count = 1;
                start = i;
            }
        }
        if(count >= 3){
            tempList.add(start);
            tempList.add(end);
            list.add(tempList);
        }
        return list;
    }
}
