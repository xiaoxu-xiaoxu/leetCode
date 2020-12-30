package xiaoxu.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/30 9:08
 */
public class InsertSort{

    @Test
    public void test(){
        int[] arr = {4,2,3,1,1,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 4 2 3
    // 2 4 3
    public void insertSort(int[] arr){

        int insertVal, insertIndex;
        for(int i = 1; i < arr.length; i++){
            insertVal = arr[i];
            insertIndex = i;
            while(insertIndex > 0 && insertVal < arr[i - 1]){
                arr[insertIndex] = arr[--i];
                insertIndex--;
            }
            arr[insertIndex] = insertVal;
        }
    }
}
