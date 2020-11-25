package xiaoxu.demo2;

import java.math.BigInteger;

/**
 * @author xx
 * @create 2020/11/4 9:16
 */
public class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString(){
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

class Solution{
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        //l3.next = l7;
        //l7.next = l8;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        ListNode l9 = new ListNode(8);
        ListNode l10 = new ListNode(9);
        l4.next = l5;
        l5.next = l6;
        //l6.next = l9;
        //l9.next = l10;

        //System.out.println("549".charAt(2));
        addTwoNumbers1(l1, l4);

        ListNode listNode = sumOfTwoLinkList(l1, l4);

        show(listNode);


    }

    public static ListNode sumOfTwoLinkList(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return null;
        }
        long i1 = Long.parseLong(returnString(l1));
        long i2 = Long.parseLong(returnString(l2));
        long result = i1 + i2;
        String s1 = new StringBuilder(result + "").reverse().toString();

        ListNode returnNode = new ListNode();
        ListNode temp = returnNode;
        for(int i = 0; i < s1.length(); i++){
            temp.val = Integer.parseInt(String.valueOf(s1.charAt(i)));
            if(i < s1.length() - 1){
                ListNode forList = new ListNode();
                temp.next = forList;
                temp = forList;
            }
        }
        return returnNode;
    }

    public static String returnString(ListNode listNode){
        if(listNode == null){
            return null;
        }
        StringBuilder builder = new StringBuilder();
        ListNode temp = listNode;
        while(temp != null){
            builder.append(temp.val);
            temp = temp.next;
        }
        return builder.reverse().toString();
    }

    public static void show(ListNode listNode){
        if(listNode == null){
            return;
        }
        ListNode temp = listNode;

        while(temp != null){
            System.out.print(temp + "\t");
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2){
        // 遍历链表，将它们的位数依次相加，大于10进位
        // 如果链表长度不相等，空的地方用0代替
        // 如果最后进位不等于0，那么链表要新加一处
        ListNode result = null,temp = null;
        int car = 0;
        while(l1 != null || l2 != null){
            int s1 = l1 == null ? 0 : l1.val;
            int s2 = l2 == null ? 0 : l2.val;
            int sum = s1 + s2 + car;
            // temp为临时指针
            if(result == null){
                result = temp = new ListNode(sum % 10);
            }else{
                temp.next = new ListNode(sum % 10);
                // 后移temp
                temp = temp.next;
            }
            // 改变余数
            car = sum / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(car != 0){
            temp.next = new ListNode(car);
        }
        return result;
    }

}
