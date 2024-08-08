package link;

import java.util.ArrayList;
import java.util.List;

public class No206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                null)));
        ListNode listNode = new No206().reverseList(head);
        ListNode cur = listNode;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public ListNode reverseList(ListNode head) {
       ListNode pre=null;
       ListNode cur=head;
       while (cur!=null){
           ListNode next=cur.next;
           cur.next=pre;
           pre=cur;
           cur=next;
       }
       return pre;
    }

}
