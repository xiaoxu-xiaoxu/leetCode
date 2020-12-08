package xiaoxu.leetCode3;

/**
 * @author xx
 * @create 2020/12/8 15:30
 */
public class MissingNumber{

    /**
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
     * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
     * 输入: [0,1,3]
     * 输出: 2
     * 输入: [0,1,2,3,4,5,6,7,9]
     * 输出: 8
     */
    public int missingNumber(int[] nums) {
        int temp = 0;
        for(int num : nums){
            if(temp != num){
                return temp;
            }
            temp++;
        }
        return temp;
    }
}
