package 剑指offer;

/**
 * @author wht
 * @date 2023/9/4 13:15
 */
public class 删除链表的中间节点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        ListNode temp = new ListNode(),p = head.next,pre = head;
        ListNode t = temp;
        while(p != null && p.next != null){
            t.next = p;
            t = t.next;
            pre.next = p.next;
            pre = p.next;
            p = p.next.next;
        }
        if(p != null){
            t.next = p;
            t = p;
        }
        t.next = null;
        pre.next = temp.next;
        temp.next = null;

    }

    private static void fun01() {
        ListNode head = new ListNode(1);
        ListNode slow = head,p = slow;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(p.next == null){
            head = null;
        }else{
            p.next = p.next.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



