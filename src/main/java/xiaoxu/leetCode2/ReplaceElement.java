package xiaoxu.leetCode2;

/**
 * @author xx
 * @create 2020/12/3 16:54
 */
public class ReplaceElement{

    public int[] replace(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            result[i] = Math.max(arr[i + 1], result[i + 1]);
        }
        return result;
    }

    /**
     * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
     * 完成所有替换操作后，请你返回这个数组。
     * 输入：arr = [17,18,5,4,6,1]
     * 输出：[18,6,6,6,1,-1]
     */
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        if (arr.length == 0){
            return res;
        }
        res[arr.length - 1] = -1;
        for (int i=arr.length - 2; i>=0; i--){
            res[i] = Math.max(arr[i + 1], res[i + 1]);
        }
        return res;
    }
}
