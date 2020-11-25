package xiaoxu.leetCode2;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/24 16:30
 */
public class CountCharacters{

    @Test
    public void test(){
        String[] arr = {"cat","bt","hat","tree"};
        countCharacters(arr, "atach");
    }

    /**
     * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
     * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
     * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次
     * 返回词汇表 words 中你掌握的所有单词的 长度之和。
     * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
     * 输出：6
     * 解释：
     * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6
     */
    public int countCharacters(String[] words, String chars) {
        if(words == null || chars == null){
            return 0;
        }
        String temp;
        int count = 0, result = 0;
        for(String str : words){
            temp = chars;
            for(int i = 0; i < str.length(); i++){
                if(temp.contains(str.subSequence(i, i + 1))){
                    count++;
                    // string的不可变性
                    temp = temp.replaceFirst(String.valueOf(str.charAt(i)), " ");
                }
            }
            if(count == str.length()){
                result += str.length();
            }
            count = 0;
        }
        return result;
    }
}
