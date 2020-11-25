package xiaoxu.demo2;

import java.util.*;

/**
 * @author xx
 * @create 2020/10/20 14:19
 */
public class SingleLinkListDemo{

    // 头节点不存放数据，只是作为链表的头部存在
    public static final LinkListNode headNode = new LinkListNode();

    // 遍历链表
    public static void showData(LinkListNode headNode){
        if(headNode.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        LinkListNode temp = headNode;
        while(temp.getNext() != null){
            System.out.println(temp.getNext());
            temp = temp.getNext();
        }
    }

    // 向链表中添加数据
    public void addData(LinkListNode linkListNode){
        LinkListNode temp = headNode;
        // 找到最后一个节点
        while(true){
            if(temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
        }
        // 让next指向新添加进来的节点
        temp.setNext(linkListNode);
    }

    // 按照顺序添加
    public void sortAddData(LinkListNode linkListNode){
        LinkListNode temp = headNode;
        while(true){
            if(temp.getNext() == null){
                break;
            }
            if(temp.getNext().getNo() > linkListNode.getNo()){
                break;
            }
            temp = temp.getNext();
        }
        // 添加
        linkListNode.setNext(temp.getNext());
        temp.setNext(linkListNode);
    }

    // 修改节点的信息
    public void editNode(LinkListNode linkListNode){
        LinkListNode temp = headNode;
        while(true){
            if(headNode.getNext() == null){
                System.out.println("链表为空，无法修改");
                return;
            }else{
                if((temp.getNext() != null) && (temp.getNext().getNo().equals(linkListNode.getNo()))){
                    temp.getNext().setAge(linkListNode.getAge());
                    temp.getNext().setName(linkListNode.getName());
                    return;
               }else{
                    if(temp.getNext() == null){
                        System.out.println("不存在该节点");
                        return;
                    }
                }
                temp = temp.getNext();
            }
        }
    }

    // 删除节点
    public void deleteNode(LinkListNode linkListNode){
        LinkListNode temp = headNode;
        while(true){
            if(headNode.getNext() == null){
                System.out.println("链表为空，无法修改");
                return;
            }else{
                if((temp.getNext() != null) && (temp.getNext().getNo().equals(linkListNode.getNo()))){
                    if(temp.getNext().getNext() == null){
                        temp.setNext(null);
                    }else{
                        temp.setNext(temp.getNext().getNext());
                    }
                    return;
                }else{
                    if(temp.getNext() == null){
                        System.out.println("不存在该节点");
                        return;
                    }
                }
                temp = temp.getNext();
            }
        }
    }

    // 计算链表的有效数据个数
    public int effectCount(){
        if(headNode.getNext() == null){
            return 0;
        }
        LinkListNode temp = headNode;
        int length = 0;
        while(temp.getNext() != null){
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    // 返回链表的倒数第k个元素
    public LinkListNode getLastNode(int index){
        if(headNode.getNext() == null){
            return null;
        }
        // 获取链表的有效数据个数
        int effectCount = effectCount();
        LinkListNode temp = headNode.getNext();
        if(index <= 0 || index > effectCount){
            return null;
        }
        for(int i = 0; i < effectCount - index; i++){
            temp = temp.getNext();
        }
        return temp;
    }

    // 反转链表
    public void reverseLinkListNode(){
        if(headNode.getNext() == null || headNode.getNext().getNext() == null){
            System.out.println("链表为空，或只有一个元素，无法反转");
            return;
        }
        LinkListNode temp = headNode.getNext();
        LinkListNode next = null;
        LinkListNode newHeadNode = new LinkListNode();

        while(temp != null){
            next = temp.getNext();
            temp.setNext(newHeadNode.getNext());
            newHeadNode.setNext(temp);
            temp = next;
        }
        headNode.setNext(newHeadNode.getNext());
    }

    // 反序打印链表
    public void reverseShowLinkListNode(){
        if(headNode.getNext() == null){
            System.out.println("链表为空无法打印");
            return;
        }
        LinkListNode temp = headNode;
        Stack<LinkListNode> stack = new Stack<>();
        // 将链表遍历放入栈中
        while(temp.getNext() != null){
            stack.push(temp.getNext());
            temp = temp.getNext();
        }
        // 将栈中元素弹出
        while(stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    // 将两个有序的链表合并，让其仍然有序
    public LinkListNode mergeLinkListNode(LinkListNode headNode1, LinkListNode headNode2){
        if(headNode1.getNext() == null && headNode2.getNext() == null){
            System.out.println("两个链表为空");
            return null;
        }
        LinkListNode newHeadNode = new LinkListNode();
        LinkListNode temp1 = headNode1;
        LinkListNode temp2 = headNode2;
        ArrayList<LinkListNode> list = new ArrayList<>();
        while(temp1.getNext() != null){
            list.add(temp1.getNext());
            temp1 = temp1.getNext();
        }
        while(temp2.getNext() != null){
            list.add(temp2.getNext());
            temp2 = temp2.getNext();
        }
        // 实现Comparable接口
        Collections.sort(list);

        // 实现Comparator接口 比较器
        /*list.sort(new Comparator<LinkListNode>(){
            @Override
            public int compare(LinkListNode o1, LinkListNode o2){
                return o1.getNo().compareTo(o2.getNo());
            }
        });*/
        newHeadNode.setNext(list.get(0));
        LinkListNode temp = list.get(0);
        for(int i = 1; i < list.size(); i++){
            temp.setNext(list.get(i));
            temp = list.get(i);
            temp.setNext(null);
        }
        return newHeadNode;
    }

}
