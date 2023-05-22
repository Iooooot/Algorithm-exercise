package LeetCode100;

/**
 * @author wht
 * @date 2023/5/3 11:44
 */
public class 最大子数组和 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
        }
        int ans = dp[0];
        for (int i = 1; i < len; i++) {
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(ans);
    }
}
