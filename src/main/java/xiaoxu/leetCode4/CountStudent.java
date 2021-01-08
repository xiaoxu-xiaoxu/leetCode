package xiaoxu.leetCode4;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xx
 * @create 2021/1/8 10:54
 */
public class CountStudent{

    //[1,0,1,0,1,1,0,1,1,1,1,0,0,0,1,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0]
    //[0,1,0,0,1,1,1,1,1,1,0,1,1,0,0,0,1,1,0,0,1,1,1,1,0,0,1,0,1,0]
    @Test
    public void test(){
        int[] arr = {1,0,1,0,1,1,0,1,1,1,1,0,0,0,1,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        int[] arr1 = {0,1,0,0,1,1,1,1,1,1,0,1,1,0,0,0,1,1,0,0,1,1,1,1,0,0,1,0,1,0};
        System.out.println(countStudents(arr, arr1));
    }

    /**
     * 学校的自助午餐提供圆形和方形的三明治，分别用数字 0 和 1 表示。
     * 所有学生站在一个队列里，每个学生要么喜欢圆形的要么喜欢方形的。
     * 餐厅里三明治的数量与学生的数量相同。所有三明治都放在一个 栈 里，每一轮：
     * 如果队列最前面的学生 喜欢 栈顶的三明治，那么会 拿走它 并离开队列。
     * 否则，这名学生会 放弃这个三明治 并回到队列的尾部。
     * 这个过程会一直持续到队列里所有学生都不喜欢栈顶的三明治为止。
     * 给你两个整数数组 students 和 sandwiches ，其中 sandwiches[i] 是栈里面
     * 第 i​​​​​​ 个三明治的类型（i = 0 是栈的顶部）， students[j] 是初始队列里第 j​​​​​​ 名学生对
     * 三明治的喜好（j = 0 是队列的最开始位置）。请你返回无法吃午餐的学生数量。
     *
     * 输入：students = [1,1,0,0], sandwiches = [0,1,0,1]
     * 输出：0
     * 解释：
     * - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,0,0,1]。
     * - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,0,1,1]。
     * - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [0,1,1]，三明治栈为 sandwiches = [1,0,1]。
     * - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,1,0]。
     * - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1,0]，三明治栈为 sandwiches = [0,1]。
     * - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,1]。
     * - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1]，三明治栈为 sandwiches = [1]。
     * - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = []，三明治栈为 sandwiches = []
     *
     * 所以所有学生都有三明治吃
     * 输入：students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
     * 输出：3
     *  2 1 1 0 0 1    0 0 0 1 1
     *  2 1 1 2 0 1    0 0 1 1
     *  2 1 1 2 2 1    0 1 1
     *
     *
     */
    public int countStudents(int[] students, int[] sandwiches) {
        int i = 0, j = 0, count = 0, flg = 0;
        while(j < sandwiches.length){
            if(students[i] == sandwiches[j]){
                students[i] = 2;
                j++;
            }
            i++;
            i %= students.length;
            if(i == 0){
                flg++;
            }
            if(flg > students.length / 2){
                break ;
            }
        }
        for(int k = 0; k < students.length; k++){
            if(students[k] == 1 || students[k] == 0){
                count++;
            }
        }
        return count;
    }
}
