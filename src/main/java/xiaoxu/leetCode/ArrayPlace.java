package xiaoxu.leetCode;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/23 11:01
 */
public class ArrayPlace{

    @Test
    public void test(){
        int[] arr = {0,0,0,0,0,1};
        System.out.println(canPlaceFlowers(arr, 2));
    }

    /**
     * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有,
     * 可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     *
     * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），
     * 和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
     *
     * 输入: flowerbed = [1,0,0,0,1], n = 1
     * 输出: True
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null){
            return false;
        }
        int i = 0, count = 0;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                flowerbed[i] = 1;
                count ++;
            }
            i++;
        }
        return count >= n;
    }

}
