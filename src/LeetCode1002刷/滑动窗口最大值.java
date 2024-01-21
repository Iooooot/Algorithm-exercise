package LeetCode1002刷;

import java.util.ArrayDeque;

/**
 * @author wht
 * @date 2024/1/17 9:56
 */
public class 滑动窗口最大值 {
    public static void main(String[] args) {
        int[] nums = {7,2,4};
        int k = 2;
        int[] ans = new int[nums.length];
        int cnt = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if(!queue.isEmpty() && queue.peek() < i - k + 1){
                queue.poll();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            queue.offer(i);

            if(i >= k-1){
                ans[cnt++] = nums[queue.peek()];
            }
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
