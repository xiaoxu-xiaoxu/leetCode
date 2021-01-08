package xiaoxu.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author xx
 * @create 2021/1/8 15:02
 */
public class ListIteratorDemo{

    @Test
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> listIterator = list.listIterator(2);
        listIterator.add(5);
        System.out.println(list);
    }
}
