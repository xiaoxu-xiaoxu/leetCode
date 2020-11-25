package xiaoxu.demo1;

/**
 * @author xx
 * @create 2020/9/4 10:04
 */
public class InstanceOfDemo {
    public static void main(String[] args) {

        String s = new String("23");

        if(s instanceof Object){
            System.out.println(s);
        }
    }
}
