package xiaoxu.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/25 9:33
 */
public class SelectSort{

    @Test
    public void test(){
        int[] arr = {3, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void sort(int[] arr){

        int min, index;
        for(int j = 0; j < arr.length - 1; j++){
            min = arr[j];
            index = j;
            for(int i = j; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                    index = i;
                }
            }
            arr[index] = arr[j];
            arr[j] = min;
        }

    }
}
