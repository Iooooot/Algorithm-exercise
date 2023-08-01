package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2023/7/31 10:12
 */
public class 从尾到头打印链表 {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        dfs(head);
        Integer[] array = list.toArray(new Integer[list.size()]);

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    private static void dfs(ListNode head) {
        if(head == null){
            return;
        }
        dfs(head.next);
        list.add(head.val);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
