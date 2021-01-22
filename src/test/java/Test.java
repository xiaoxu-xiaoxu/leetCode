/**
 * @author xx
 * @create 2020/12/14 17:56
 */
public class Test{

    @org.junit.Test
    public void test1(){
        int i = 1;
        ++i;
        int b = 9;
    }

    @org.junit.Test
    public void test(){
        long l = System.currentTimeMillis();
        int a = 0;
        for(int i = 0; i < 1000000; i++){
            a++;
            for(int j = 0; j < 1000000; j++){
                a++;
            }
        }

        System.out.println(a);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
