package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/10/22 10:51
 */
public class LambdaDemo{
    public static void main(String[] args){
//        Add add = Integer::sum;
//        int add1 = add.add(1, 2);
//        System.out.println(add1);

        Add chen = (int a, int b) -> a * b;
        System.out.println(chen.chen(3, 5));
    }
}

interface Add{
    //int add(int a, int b);

    int chen(int a, int b);
}
