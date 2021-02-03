package xiaoxu.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2021/1/28 16:13
 */
public class ArrayDemo{

    @Test
    public void test(){
        int[] arr = {1,2,3};
        int[] arr1 = arr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


    public int[] arr(int[] arr){
        Arrays.fill(arr, 1);
        return arr;
    }
}
