package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/10/29 15:14
 */
public class DoubleLinkedListNode{

    private Integer no;

    private DoubleLinkedListNode next;

    private DoubleLinkedListNode prev;

    private DoubleLinkedListNode child;

    public DoubleLinkedListNode(Integer no){
        this.no = no;
    }

    @Override
    public String toString(){
        return "DoubleLinkedListNode{" +
                "no=" + no +
                '}';
    }

    public Integer getNo(){
        return no;
    }

    public void setNo(Integer no){
        this.no = no;
    }

    public DoubleLinkedListNode getNext(){
        return next;
    }

    public void setNext(DoubleLinkedListNode next){
        this.next = next;
    }

    public DoubleLinkedListNode getPrev(){
        return prev;
    }

    public void setPrev(DoubleLinkedListNode prev){
        this.prev = prev;
    }

    public DoubleLinkedListNode getChild(){
        return child;
    }

    public void setChild(DoubleLinkedListNode child){
        this.child = child;
    }
}


class DemoTest{
    public static void main(String[] args){

    }

    public DoubleLinkedListNode test(DoubleLinkedListNode head){
      return null;
    }
}











