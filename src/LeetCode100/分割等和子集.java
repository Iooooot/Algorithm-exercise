package LeetCode100;

/**
 * @author wht
 * @date 2023/6/26 9:33
 */
public class 分割等和子集 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum % 2 != 0){
            System.out.println(false);
            return;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[len][target+1];
        if(nums[0] <= target){
            dp[0][nums[0]] = true;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= target; j++) {
                // 不选i
                dp[i][j] = dp[i-1][j];
                // 选i
                if(nums[i] == j){
                    dp[i][j] = true;
                    continue;
                }
                if(nums[i] < j){
                    dp[i][j] = dp[i][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        System.out.println(dp[len-1][target]);
    }
}
