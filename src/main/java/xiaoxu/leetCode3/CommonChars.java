package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/28 10:29
 */
public class CommonChars{

    /**
     * 给定仅有小写字母组成的字符串数组 A，
     * 返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
     * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
     * 输入：["bella","label","roller"]
     * 输出：["e","l","l"]
     * 输入：["cool","lock","cook"]
     * 输出：["c","o"]
     *
     * 思路：建立映射关系
     * 数组下标代表小写字母，数组存的值代表其出现的次数
     * 通过循环迭代来找到最终的映射关系
     */
    public List<String> commonChars(String[] A) {
        int[] res = new int[26];
        Arrays.fill(res, 'z' + 1);
        for(String s : A){
            int[] temp = new int[26];
            for(int i = 0; i < s.length(); i++){
                ++temp[s.charAt(i) - 'a'];
            }
            for(int i = 0; i < 26; i++){
                res[i] = Math.min(temp[i], res[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i]; j++){
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }

    @Test
    public void test(){
        System.out.println((char)(4 + 'a'));
        String[] arr = {"cool","lock","cook"};
        List<String> list = commonChars(arr);
        System.out.println(list);
    }

}
