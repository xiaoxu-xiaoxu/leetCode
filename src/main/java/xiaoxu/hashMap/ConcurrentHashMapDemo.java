package xiaoxu.hashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author xx
 * @create 2021/1/11 16:16
 */
public class ConcurrentHashMapDemo{

    @Test
    public void test(){
        Map<String, Integer> map = new HashMap<>();//new ConcurrentHashMap<>();


        new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 30; i++){
                    map.put(i+"",i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i = 30; i < 60; i++){
                    map.put(i+"",i);
                }
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();

        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("--------------");
        System.out.println(map.size());
    }

    @Test
    public void test1() throws InterruptedException{
        Map<Integer, Integer> map = new HashMap<>();

        CountDownLatch countDownLatch = new CountDownLatch(4);

        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                map.put(i,i);
            }
            countDownLatch.countDown();
        }).start();

        new Thread(()->{
            for (int i = 1000; i < 2000; i++) {
                map.put(i,i);
            }
            countDownLatch.countDown();
        }).start();

        new Thread(()->{
            for (int i = 2000; i < 3000; i++) {
                map.put(i,i);
            }
            countDownLatch.countDown();
        }).start();

        new Thread(()->{
            for (int i = 3000; i < 4000; i++) {
                map.put(i,i);
            }
            countDownLatch.countDown();
        }).start();

        countDownLatch.await();
        System.out.println(map.size());
    }

}
