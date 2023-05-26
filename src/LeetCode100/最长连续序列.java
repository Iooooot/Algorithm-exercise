package LeetCode100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wht
 * @date 2023/5/25 9:23
 */
public class 最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (Integer num : set) {
            int len = 1;
            while (set.contains(num + 1)) {
                len++;
                num++;
            }
            ans = Math.max(ans, len);
        }
        System.out.println(ans);
    }
}
