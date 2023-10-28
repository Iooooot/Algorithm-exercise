package lq真题;

/**
 * @author wht
 * @date 2023/10/27 9:15
 */
public class 买卖股票的最佳时机II {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][1] -= prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
        }
        System.out.println(dp[len-1][0]);
    }
}
