package xiaoxu.demo2;


import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @author xx
 * @create 2020/10/30 15:57
 */
public class AnnotationTestDemo{
    public static void main(String[] args) throws Exception{
        Class<AnnotationTestDemo> clazz = AnnotationTestDemo.class;
        Method test = clazz.getDeclaredMethod("test");
        Integer invoke = (Integer) test.invoke(clazz.newInstance());
        System.out.println(invoke);
    }

    public int test(){
        return 1;
    }
}
