package xiaoxu.leetCode;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/19 9:49
 */
public class MoveZeros{

    @Test
    public void test(){
        int[] arr = {0, 0, 1};
        moveZeroes(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

    // 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    // 输入: [0,1,0,3,12]
    // 输出: [1,3,12,0,0]
    public void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int count = 0;
        while(count < nums.length - 1){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j + 1] == 0){
                    continue;
                }
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            count++;
        }
    }

    public void moveZeroes1(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    /**
     *
     * 双指针：
     *      定义两个指针，初始时，指向数组头部
     *      对于left指针来说，如果它的左边没有0，代表结束
     *      对于right指针，走到最后之后，它跟left中间都是0，包括自身
     *
     *      0 0 1    初始  left == right = 0
     *               第一次  right ++ 不交换 right 指向第二个0
     *               第二次 right ++ right 指向1 那么交换 left 和 right    1 0 0
     *               交换的条件就是 arr[right] != 0
     *               循环结束的条件： right 走到数组的尾部结束
     */
    public void moveZeroes2(int[] arr){
        int right = 0, left = 0;
        while(right < arr.length){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left ++;
            }
            right ++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
