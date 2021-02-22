import xiaoxu.demo1.Father;
import xiaoxu.demo1.Son;
import xiaoxu.proxy.Calculator;
import xiaoxu.proxy.MyCalculator;
import xiaoxu.proxy.MyProxy;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author xx
 * @create 2020/12/14 17:56
 */
public class Test{

    @org.junit.Test
    public void test3(){
        Son son = new Son();
        Class<? extends Son> clazz = son.getClass();
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
        Type actualTypeArgument = type.getActualTypeArguments()[0];
        System.out.println(actualTypeArgument.getTypeName());
    }

    @org.junit.Test
    public void test2(){
        Calculator calculator = new MyCalculator();
        MyProxy myProxy = new MyProxy(calculator);
        Calculator instance = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(),
                myProxy);
        System.out.println(instance);
        int sum = instance.sum(1, 2);
        System.out.println(sum);
    }

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
        }

        System.out.println(a);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
