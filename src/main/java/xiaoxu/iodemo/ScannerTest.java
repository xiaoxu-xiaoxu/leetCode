package xiaoxu.iodemo;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author xx
 * @create 2020/11/6 11:05
 */
public class ScannerTest{
    public static void main(String[] args){

    }

    @Test
    public void test(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入");
            String next = scanner.next();
            System.out.println(next);
        }
    }
}
