package xiaoxu.leetCode2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xx
 * @create 2020/12/2 11:37
 */
public class Dominoes{

    public int numEquivDominoPairs1(int[][] dominoes) {
        if(dominoes == null || dominoes.length == 0){
            return 0;
        }
        Map<String, Integer> map = new HashMap<>();
        int count = 1, result = 0;
        for(int[] arr : dominoes){
            String str = arr[0] > arr[1] ? arr[1] + "" + arr[0] : arr[0] + "" + arr[1];
            if(!map.containsKey(str)){
                map.put(str, count);
                continue;
            }
            map.put(str, map.get(str) + 1);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> m : set){
            if(m.getValue() > 1){
                result += m.getValue() * (m.getValue() - 1) / 2;
            }
        }
        return result;
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        if(dominoes == null || dominoes.length == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < dominoes.length - 1; i++){
            for(int j = i + 1; j < dominoes.length; j++){
                if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) ||
                        (dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0])){
                    count++;
                }
            }
        }
        return count;
    }
}
