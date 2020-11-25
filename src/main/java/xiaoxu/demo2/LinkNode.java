package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/11/3 11:25
 */
public class LinkNode{

    private Integer no;

    private LinkNode prev;

    private LinkNode next;

    private LinkNode child;

    public LinkNode(Integer no){
        this.no = no;
    }

    @Override
    public String toString(){
        return "LinkNode{" +
                "no=" + no +
                '}';
    }

    public Integer getNo(){
        return no;
    }

    public void setNo(Integer no){
        this.no = no;
    }

    public LinkNode getPrev(){
        return prev;
    }

    public void setPrev(LinkNode prev){
        this.prev = prev;
    }

    public LinkNode getNext(){
        return next;
    }

    public void setNext(LinkNode next){
        this.next = next;
    }

    public LinkNode getChild(){
        return child;
    }

    public void setChild(LinkNode child){
        this.child = child;
    }
}

class TestDemo{

    public static void main(String[] args){
        LinkNode node1 = new LinkNode(1);
        LinkNode node2 = new LinkNode(2);
        LinkNode node3 = new LinkNode(3);
        LinkNode node4 = new LinkNode(4);
        LinkNode node5 = new LinkNode(5);
        LinkNode node6 = new LinkNode(6);
        LinkNode node7 = new LinkNode(7);

        node1.setChild(node2);
        node2.setChild(node3);
        node1.setNext(node4);
        node4.setNext(node5);
        node2.setNext(node6);

        LinkNode linkNode = mergeLinkNode(node1);

        show(linkNode);

    }

    // 扁平化双向链表
    public static LinkNode mergeLinkNode(LinkNode headNode){
        if(headNode == null){
            return null;
        }
        LinkNode temp = headNode;
        while(true){
            LinkNode child = null;
            LinkNode next = null;
            if(temp.getChild() != null){
                child = temp.getChild();
                next = temp.getNext();
                temp.setChild(null);
                temp.setNext(child);
                child.setPrev(temp);
                // 找到child节点的最后一个
                while(child.getNext() != null){
                    child = child.getNext();
                }
                // 循环结束child就是最后一个元素，将最后一个元素加入到next中
                // next可能为null，如果next是null，那么就不需要进行插入元素的操作
                if(next != null){
                    next.setPrev(child);
                    child.setNext(next);
                }
                // 移动指针
                temp = temp.getNext();
            }else{
                break;
            }
        }
        return headNode;
    }


    // 遍历链表
    public static void show(LinkNode headNode){
        if(headNode == null){
            System.out.println("空链表");
            return;
        }
        LinkNode temp = headNode;
        while(temp != null){
            System.out.print(temp + "\t");
            temp = temp.getNext();
        }
    }

}


