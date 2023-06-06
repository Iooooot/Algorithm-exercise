package LeetCode100;

/**
 * @author wht
 * @date 2023/6/5 9:33
 */
public class 打家劫舍 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        System.out.println(dp[len-1]);
    }
}
