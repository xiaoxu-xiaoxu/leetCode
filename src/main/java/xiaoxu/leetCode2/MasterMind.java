package xiaoxu.leetCode2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2020/12/3 13:52
 */
public class MasterMind{

    public int[] masterMind1(String solution, String guess){
        int count = 0;
        int[] result = new int[2];
        for(int i = 0; i < solution.length(); i++){
            if(solution.charAt(i) == guess.charAt(i)){
                count ++;
                solution = solution.substring(0, i) + solution.substring(i + 1);
                guess = guess.substring(0, i) + guess.substring(i + 1);
            }
        }
        result[0] = count;
        count = 0;
        l:for(int i = 0; i < solution.length(); i++){
            char c = solution.charAt(i);
            for(int j = 0; j < guess.length(); j++){
                if(c == guess.charAt(j)){
                    count ++;
                    guess = guess.substring(0, j) + guess.substring(j + 1);
                    continue l;
                }
            }
        }
        result[1] = count;
        return result;
    }

    /**
     * 两个字符串相应位置是否相同，相同的个数就是猜中的。
     * 而伪猜中的意思是除了猜中外，其他有相同的元素，但是在不同位置的数目
     * 输入： solution="RGBY",guess="GGRR"
     * 输出： [1,1]
     * 解释： 猜中1次，伪猜中1次
     * 猜中： sIndex == gIndex && sNum = gNum
     * 伪猜中： gNum in sNum && gIndex != sIndex
     */
    public int[] masterMind(String solution, String guess) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int[] result = new int[2];
        StringBuilder sBuilder = new StringBuilder(), gBuilder = new StringBuilder();
        for(int i = 0; i < solution.length(); i++){
            if(solution.charAt(i) == guess.charAt(i)){
                count ++;
                list.add(i);
            }
        }
        result[0] = count;
        count = 0;
        for(int i = 0; i < solution.length(); i++){
            if(list.contains(i)){
                continue;
            }
            sBuilder.append(solution.charAt(i));
            gBuilder.append(guess.charAt(i));
        }
        solution = sBuilder.toString();
        guess = gBuilder.toString();
        list.clear();
        l:for(int i = 0; i < solution.length(); i++){
            char c = solution.charAt(i);
            for(int j = 0; j < guess.length(); j++){
                if(c == guess.charAt(j)){
                    count ++;
                    guess = guess.substring(0, j) + guess.substring(j + 1);
                    continue l;
                }
            }
        }
        result[1] = count;
        return result;
    }

}
