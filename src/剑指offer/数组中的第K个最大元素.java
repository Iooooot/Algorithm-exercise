package 剑指offer;

import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2023/9/21 12:10
 */
public class 数组中的第K个最大元素 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int len = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i = 0; i < len; i++) {
            queue.add(nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = queue.remove();

        }
        System.out.println(ans);
    }
}
