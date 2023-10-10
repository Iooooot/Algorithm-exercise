package 剑指offer;

/**
 * @author wht
 * @date 2023/10/9 10:02
 */
public class 不同路径 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j == 0){
                    continue;
                }
                if(i != 0){
                    dp[i][j] += dp[i-1][j];
                }
                if(j != 0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
