package leetcode;

/**
 * @author wht
 * @date 2023/1/30 12:56
 */
public class 合并两个链表 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode pre = null,p = list1,ne = null,f = list2;
            int idx = 0;
            while(idx <= b + 1){
                if(idx == a-1){
                    pre = p;
                }
                if(idx == b+1){
                    ne = p;
                }
                idx++;
                p = p.next;
            }
            pre.next = list2;
            while(f.next != null){
                f = f.next;
            }
            f.next = ne;
            return list1;
        }
    }
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
