package xiaoxu.demo1;

/**
 * @author xx
 * @create 2020/9/8 14:50
 */
public class MathDemo2 {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1, f;
        for(int i = 0; i < 20; i++){
            f = f2;
            f2 = f + f1;
            f1 = f;
            System.out.println(f2);
        }
    }
}
