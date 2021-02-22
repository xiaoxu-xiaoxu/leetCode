package xiaoxu.proxy;

/**
 * @author xx
 * @create 2021/2/22 14:04
 */
public class MyCalculator implements Calculator{
    @Override
    public int sum(int a, int b){
        return a + b;
    }
}
