package LeetCode100;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wht
 * @date 2023/5/15 9:17
 */
public class 柱状图中最大的矩形 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int len = heights.length;
        int[] right = new int[len];
        int[] left = new int[len];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                deque.pop();
            }
            left[i] = deque.isEmpty() ? -1 : deque.peek();
            deque.push(i);
        }
        deque.clear();
        for (int i = len-1; i >= 0; i--) {
            while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                deque.pop();
            }
            right[i] = deque.isEmpty() ? len : deque.peek();
            deque.push(i);
        }
        int ans = -Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        System.out.println(ans);
    }
}
