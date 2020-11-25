package xiaoxu.demo2;

import java.util.Objects;

/**
 * @author xx
 * @create 2020/10/20 14:17
 */
public class LinkListNode implements Comparable{
    private Integer no;

    private String name;

    private Integer age;
    // 下一个节点
    private LinkListNode next;

    public LinkListNode(){}

    public LinkListNode(Integer no, String name, Integer age){
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public Integer getNo(){
        return no;
    }

    public void setNo(Integer no){
        this.no = no;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public LinkListNode getNext(){
        return next;
    }

    public void setNext(LinkListNode next){
        this.next = next;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        LinkListNode that = (LinkListNode) o;
        return Objects.equals(no, that.no) &&
                Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode(){
        return Objects.hash(no, name, age, next);
    }

    @Override
    public String toString(){
        return "LinkListNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o){
        if(o instanceof LinkListNode){
            LinkListNode listNode = (LinkListNode) o;
            return this.no.compareTo(((LinkListNode) o).getNo());
        }
        return 0;
    }
}
