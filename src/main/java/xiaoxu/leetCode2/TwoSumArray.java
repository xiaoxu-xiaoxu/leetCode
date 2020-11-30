package xiaoxu.leetCode2;

/**
 * @author xx
 * @create 2020/11/27 11:20
 */
public class TwoSumArray{

    // 有序  1 2 3 4   5    2 3
    public int[] twoSum1(int[] numbers, int target) {
        if(numbers == null){
            return null;
        }
        int[] arr = new int[2];

        return arr;
    }


    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null){
            return null;
        }
        int[] arr = new int[2];
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] + numbers[numbers.length - 1] < target){
                continue;
            }
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }
        return arr;
    }
}
