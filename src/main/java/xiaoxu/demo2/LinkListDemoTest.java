package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/10/20 14:35
 */
public class LinkListDemoTest{
    public static void main(String[] args){
        LinkListNode linkListNode1 = new LinkListNode(1, "xiaoxu", 22);
        LinkListNode linkListNode2 = new LinkListNode(5, "xiaoli", 21);
        LinkListNode linkListNode3 = new LinkListNode(7, "xiaobao", 25);
        LinkListNode linkListNode4 = new LinkListNode(6, "xiaozha", 20);
        LinkListNode linkListNode5 = new LinkListNode(2, "xiaozhang", 100);
        LinkListNode linkListNode6 = new LinkListNode(4, "xiaozhang", 100);
        LinkListNode linkListNode7 = new LinkListNode(8, "xiaozhang", 100);
        LinkListNode linkListNode8 = new LinkListNode(10, "xiaozhang", 100);
        LinkListNode linkListNode9 = new LinkListNode(9, "xiaozhang", 100);

        SingleLinkListDemo linkList = new SingleLinkListDemo();
        SingleLinkListDemo linkList2 = new SingleLinkListDemo();

        linkList.addData(linkListNode2);
        linkList.addData(linkListNode1);
        linkList.addData(linkListNode4);
        linkList.addData(linkListNode3);
        linkList2.addData(linkListNode5);
        linkList2.addData(linkListNode6);
        linkList2.addData(linkListNode7);
        linkList2.addData(linkListNode8);
        linkList2.addData(linkListNode9);

        LinkListNode linkListNode = linkList.mergeLinkListNode(linkList.headNode, linkList2.headNode);
        SingleLinkListDemo.showData(linkListNode);

        //linkListNode2.setAge(100);
        //linkList.deleteNode(linkListNode5);
        //linkList.deleteNode(linkListNode5);
        //linkListNode1.setName("shaisa");
//        linkList.showData();
//
//        linkList.reverseLinkListNode();
//        System.out.println("-------------------");
//
//        linkList.showData();

        //System.out.println(linkList.effectCount());

        //System.out.println(linkList.getLastNode(2));


    }
}
