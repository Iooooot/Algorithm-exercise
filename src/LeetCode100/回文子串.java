package LeetCode100;

/**
 * @author wht
 * @date 2023/7/8 9:44
 */
public class 回文子串 {
    public static void main(String[] args) {
        String s = "abc";
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    if(i - j < 3){
                        dp[i][j] = true;
                    } else {
                      dp[i][j] = dp[i-1][j+1];
                    }
                }else{
                    dp[i][j] = false;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(dp[i][j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
