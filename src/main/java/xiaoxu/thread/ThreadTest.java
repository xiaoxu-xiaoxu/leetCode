package xiaoxu.thread;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/6 14:31
 */
public class ThreadTest{
    public static void main(String[] args){
        new Thread(() -> {
            for(int i = 11; i < 21; i++){
                System.out.println(i);
            }
        }).start();
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        }).start();

        System.out.println("xiaoxu");
        System.out.println("lijiang");
    }

}
