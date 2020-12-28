package xiaoxu.leetCode3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/24 15:21
 */
public class NumberSmaller{
    /**
     * 我们来定义一个函数 f(s)，其中传入参数 s 是一个非空字符串；
     * 该函数的功能是统计s中（按字典序比较）最小字母的出现频次。
     * 例如，若s = "dcce"，那么f(s) = 2，因为最小的字母是"c"，它出现了 2 次。
     * 现在，给你两个字符串数组待查表queries 
     * 和词汇表words，请你返回一个整数数组answer 
     * 作为答案，其中每个answer[i]是满足 
     * f(queries[i])< f(W)的词的数目，W是词汇表words中的词。
     * 输入：queries=["cbd"], words = ["zaaaz"]
     * 输出：[1]
     * 解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。
     * 输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
     * 输出：[1,2]
     * 解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。
     */
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] qArr = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            qArr[i] = countSmall(queries[i]);
        }
        int[] wArr = new int[words.length];
        for(int i = 0; i < words.length; i++){
            wArr[i] = countSmall(words[i]);
        }
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int count = 0;
            for(int j = 0; j < words.length; j++){
                if(qArr[i] < wArr[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }


    public int countSmall(String str){
        int count = 1;
        char c = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) < c){
                c = str.charAt(i);
                count = 1;
            }else if(c == str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    @Test
    public void test(){
        int i = countSmall("aaab");
        String[] q = {"bbb","cc"};
        String[] w = {"a","aa","aaa","aaaa"};
        System.out.println(Arrays.toString(numSmallerByFrequency(q, w)));
        //System.out.println(i);
    }
}
