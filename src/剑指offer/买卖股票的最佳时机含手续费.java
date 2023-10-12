package 剑指offer;

/**
 * @author wht
 * @date 2023/10/11 11:16
 */
public class 买卖股票的最佳时机含手续费 {
    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int n = prices.length;
        int[][] dp = new int[n][3];
        dp[0][0] = 0;
        // 买入
        dp[0][1] -= prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]-fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        System.out.println(dp[n-1][0]);
    }
}
