package xiaoxu.leetCode2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @create 2020/11/27 11:07
 */
public class RList{


    public int[] decompressRLElist(int[] nums) {
        if(nums == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=2){
            for(int j = 0; j < nums[i]; j++){
                list.add(nums[i + 1]);
            }
        }
        nums = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
