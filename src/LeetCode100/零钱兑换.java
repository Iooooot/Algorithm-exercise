package LeetCode100;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/6/21 12:00
 */
public class 零钱兑换 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
                }
            }
        }
    }
}
