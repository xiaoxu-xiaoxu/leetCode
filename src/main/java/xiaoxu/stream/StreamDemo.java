package xiaoxu.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xx
 * @create 2021/1/14 16:39
 */
public class StreamDemo{

    private static List<Person> personList = new ArrayList<Person>();

    static {
        personList.add(new Person("Tom", 8900, "male", "New York"));
        personList.add(new Person("Jack", 7000, "male", "Washington"));
        personList.add(new Person("Lily", 7800, "female", "Washington"));
        personList.add(new Person("Anni", 8200, "female", "New York"));
        personList.add(new Person("Owen333", 9500, "male", "New York"));
        personList.add(new Person("Alisa", 7900, "female", "New York"));
    }

    @Test
    public void test9(){
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new TreeMap<>(((o1, o2) -> o2 - o1));

    }

    @Test
    public void test8(){
        List<Person> list = personList.stream()
                .filter(x -> !x.getName().equals("Tom"))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test7(){
        Optional<Integer> reduce = personList.stream()
                .map(Person::getSalary)
                .reduce(Integer::sum);
        reduce.ifPresent(System.out::println);

        Optional<Person> max = personList.stream()
                .max(Comparator.comparingInt(Person::getSalary));
        max.ifPresent(System.out::println);
    }

    @Test
    public void test6(){
        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> coList = list.stream()
                .flatMap(x -> Arrays.stream(x.split(",")))
                .collect(Collectors.toList());
        System.out.println(coList);
    }

    @Test
    public void test5(){
        List<Person> list = personList.stream()
                .peek(x -> x.setSalary(x.getSalary() + 100))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test4(){
        List<Person> list = personList.stream()
                .peek(x -> x.setName(x.getName().toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test3(){
        Optional<String> s = personList.stream()
                .max(Comparator.comparingInt(Person::getSalary))
                .map(Person::getName);
        s.ifPresent(System.out::println);
    }

    @Test
    public void test2(){
        Optional<String> s = personList.stream()
                .max(Comparator.comparingInt(o -> o.getName().length()))
                .map(Person::getName);
        System.out.println(s);
    }

    @Test
    public void test1(){
        Optional<Person> first = personList.stream()
                .filter(x -> "male".equals(x.getSex()))
                .findFirst();
        System.out.println(first);
    }

    @Test
    public void test(){
        personList.stream()
                .filter(x -> x.getSalary() > 7800)
                .map(Person::getName)
                .forEach(System.out::println);

    }

}
