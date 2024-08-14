package link;

public class No19 {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,null);
        ListNode head1=new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,null)))));

        ListNode listNode = new No19().removeNthFromEnd(head, 1);
        ListNode cur = listNode;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int sz=0;//链表长度
        while (cur!=null){
            sz++;
            cur=cur.next;
        }
        int a=sz-n+1;//将倒数转为正数
        cur=head;
        int index=1;
        while (true){
            if(a==1){
                head=head.next;
                return head;
            }
            if(index==a-1){
                cur.next=cur.next.next;
                return head;
            }
            index++;
            cur=cur.next;
        }
    }
}
