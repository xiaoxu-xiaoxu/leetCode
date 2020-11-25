package xiaoxu.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xx
 * @create 2020/9/9 10:43
 */
public class MathDemo3 {
    public static void main(String[] args) {
        System.out.println(sumIndex1(11));
    }

    public static String sumIndex1(Integer num){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(num - arr[i])){
                return map.get(num - arr[i]) + "," + i;
            }
            map.put(arr[i], i);
        }
        return "无对应元素";
    }

    public static String sumIndex(Integer num){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == num){
                    return i + "," + j;
                }
            }
        }
        return "无对应元素";
    }
}
