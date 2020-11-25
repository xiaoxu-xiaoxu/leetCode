package xiaoxu.demo1;

/**
 * @author xx
 * @create 2020/9/8 14:28
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 */
public class MathDemo1 {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1, f;
        int M = 30;
//        System.out.println(f1);
//        System.out.println(f2);
        for (int i = 3; i < M; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println(f2);
        }

    }
}












