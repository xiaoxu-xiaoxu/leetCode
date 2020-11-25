package xiaoxu.demo1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author xx
 * @create 2020/10/9 10:21
 */
public class AnnotationDemo{
    public static void main(String[] args){
        Class clazz = Son.class;
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
        Type[] types = type.getActualTypeArguments();
        System.out.println(types[0].getTypeName());
    }
}
