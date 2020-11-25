package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/10/10 16:26
 */
public class EnumInstanceDemo{
    public static void main(String[] args){
        EnumDemo[] values = EnumDemo.values();
        for(int i = 0; i < values.length; i++){
            System.out.println(values.toString());
        }
    }
}
