package xiaoxu.demo1;

/**
 * @author xx
 * @create 2020/8/21 17:29
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{22, 5, 1, 4, 2, 6, 90, 81};

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
