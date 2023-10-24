package 剑指offer;

/**
 * @author wht
 * @date 2023/10/10 9:47
 */
public class 最长公共子序列 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+1);
                }
            }
        }
        System.out.println(dp[len1][len2]);
    }
}
