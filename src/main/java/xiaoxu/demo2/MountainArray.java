package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/11/3 14:45
 */
public class MountainArray{
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 2};

        System.out.println(judgeMountainArray(arr));
    }

    public static boolean judgeMountainArray(int[] arr){
        if(arr == null || arr.length < 3){
            return false;
        }
        int index = 0;
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                index = i;
                count ++;
            }else{
                break;
            }
        }
        if(count == arr.length - 1){
            return false;
        }
        for(int j = index + 1; j < arr.length - 1; j++){
            if(arr[j] > arr[j + 1]){
                count++;
            }else{
                break;
            }
        }
        return count == arr.length - 1;
    }

    public boolean validMountainArray(int[] A) {
        int len = A.length;
        int left = 0;
        int right = len - 1;
        //从左边往右边找，一直找到山峰为止
        while (left + 1 < len && A[left] < A[left + 1])
            left++;
        //从右边往左边找，一直找到山峰为止
        while (right > 0 && A[right - 1] > A[right])
            right--;
        //判断从左边和从右边找的山峰是不是同一个
        return left > 0 && right < len - 1 && left == right;
    }


}
