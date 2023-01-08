package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wht
 * @date 2023/1/7 10:06
 */
public class 将x减到零的最小操作数 {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums, int x) {
        x = -x;
        for (int v : nums) {
            x += v;
        }
        Map<Integer, Integer> vis = new HashMap<>();
        vis.put(0, -1);
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0, s = 0; i < n; ++i) {
            s += nums[i];
            vis.putIfAbsent(s, i);
            if (vis.containsKey(s - x)) {
                int j = vis.get(s - x);
                ans = Math.min(ans, n - (i - j));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
