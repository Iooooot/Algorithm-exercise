package LeetCode100;

/**
 * @author wht
 * @date 2023/4/14 9:23
 */
public class 最长回文子串 {
    public static void main(String[] args) {
        String s = "cbbd";
        int len = s.length();
        String ans = "";
        boolean[][] dp = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) &&  ((j-i < 2)  || dp[i+1][j-1]);
                if(dp[i][j] && j-i+1 > ans.length()){
                    ans = s.substring(i,j+1);
                }
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int i, int j, String s) {
        while(i < j) {
            if (s.charAt(i++) != s.charAt(j++)) {
                return false;
            }
        }
        return true;
    }
}
