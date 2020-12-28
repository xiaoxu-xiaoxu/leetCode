package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xx
 * @create 2020/12/28 16:30
 */
public class CanBeEqual{

    @Test
    public void test(){
        int[] arr = {1,2,3,4};
        int[] arr1 = {3,2,1,4};
        System.out.println(canBeEqual(arr, arr1));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
