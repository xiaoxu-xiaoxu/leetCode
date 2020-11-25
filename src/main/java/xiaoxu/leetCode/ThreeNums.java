package xiaoxu.leetCode;

/**
 * @author xx
 * @create 2020/11/19 16:45
 */
public class ThreeNums{

    // 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素
    // 都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    // arr = [1,2,34,3,4,5,7,23,12]
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1){
                return true;
            }
        }
        return false;
    }
}
