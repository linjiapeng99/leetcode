package link;

import java.util.List;

public class No203 {
    public static void main(String[] args) {
        ListNode head=new ListNode(2,new ListNode(2,new ListNode(2,new ListNode(2,new ListNode(2,new ListNode(2,null))))));
        ListNode node = new No203().removeElements(head, 2);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while (head!=null&&head.val==val){
            head=head.next;
            if(head==null){
                return head;
            }
        }
        ListNode pre=head;
        ListNode cur=pre.next;
        while (cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
                cur=pre.next;
            }else {
                pre=pre.next;
                cur=pre.next;
            }
        }
        return head;
    }


}
