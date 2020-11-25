package xiaoxu.leetCode2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xx
 * @create 2020/11/25 9:18
 */
public class ShiftGrid{

    @Test
    public void test(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        shiftGrid(arr, 1);
    }

    /**
     * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
     * 输出：[[9,1,2],[3,4,5],[6,7,8]]
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if(grid == null){
            return null;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        int i = 0, count = 0, length = grid[0].length == 0 ? 1: grid[0].length;
        k = k % (grid.length * length);

        if(k == 0){
            for(int[] ints : grid){
                ArrayList<Integer> lit = new ArrayList<>();
                for(int anInt : ints){
                    lit.add(anInt);
                }
                list.add(lit);
            }
            return list;
        }
        for(int[] arr : grid){
            for(int arr1 : arr){
                temp.add(arr1);
            }
        }
        int index = temp.size() - k;
        while(i < temp.size()){
            if(count < grid[0].length){
                count++;
                array.add(temp.get(index));
                index++;
                index = temp.size() == index ? 0 : index;
            }
            if(count == grid[0].length){
                List<Integer> clone = (List<Integer>) array.clone();
                list.add(clone);
                array.clear();
                count = 0;
            }
            i++;
        }
        return list;
    }
}
