package xiaoxu.sort;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @author xx
 * @create 2020/12/30 9:08
 */
public class InsertSort{

    @Test
    public void test(){
        int[] arr = new int[8000000];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(8000000);
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = dateFormat.format(date);
        System.out.println(format);
        insertSortGroup2(arr);
        Date date1 = new Date();
        String format1 = dateFormat.format(date1);
        System.out.println(format1);

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

    // 4, 6, 90, 2, 1, 0, 55, -2, -8
    // 1, 0, 55, -2, -8, 6, 90, 2, 4
    public void insertSortGroup(int[] arr){
        int temp;
        for(int gap = arr.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < arr.length; i++){
                int k = i;
                while(k - gap >= 0 && arr[k] < arr[k - gap]){
                    temp = arr[k];
                    arr[k] = arr[k - gap];
                    arr[k - gap] = temp;
                    k -= gap;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
    }


    public void insertSortGroup2(int[] arr){
        for(int gap = arr.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < arr.length; i++){
                int insertVal = arr[i];
                int insertIndex = i;
                while(insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]){
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex-= gap;
                }
                arr[insertIndex] = insertVal;
            }
            //System.out.println(Arrays.toString(arr));
        }
    }


}
