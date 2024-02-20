package LeetCode1002刷;

import java.util.HashSet;

/**
 * @author wht
 * @date 2024/2/1 11:03
 */
public class 相交链表 {
    public static void main(String[] args) {
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = headA;
        while(p != null){
            set.add(p);
            p = p.next;
        }
        p = headB;
        while(p != null){
            if(set.contains(p)){
                return p;
            }
            p = p.next;
        }
        return p;

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
