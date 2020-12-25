package xiaoxu.sort;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/25 9:20
 */
public class BubbleSort{

    @Test
    public void test(){
        int[] arr = {5, 2, 6, 9, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void sort(int[] arr){
        int temp = 0;
        boolean flag = true;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }else{
                flag = true;
            }
        }
    }
}
