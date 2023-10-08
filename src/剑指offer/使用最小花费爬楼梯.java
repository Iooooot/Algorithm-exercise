package 剑指offer;

/**
 * @author wht
 * @date 2023/10/7 9:48
 */
public class 使用最小花费爬楼梯 {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int[] dp = new int[1005];
        int len = cost.length;
        for (int i = 2; i <= len; i++) {
            dp[i] += Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        System.out.println(dp[len]);
    }
}
