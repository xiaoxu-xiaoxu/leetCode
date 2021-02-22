package xiaoxu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xx
 * @create 2021/2/22 13:59
 */
public class MyProxy implements InvocationHandler{

    private Object proxy;

    public MyProxy(Object proxy){
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        Object invoke = null;
        try{
            invoke = method.invoke(this.proxy, args);
        }catch(Exception e){
            e.printStackTrace();
        }
        return invoke;
    }
}




