package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/14 10:14
 */
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "pwwkew";
        int n = s.length();
        int[] cnt = new int[250];
        int[] q = new int[n+1];
        int tt=-1,rr=-1,ans = 1;
        for (int i = 0; i < n; i++) {
            while(tt <= rr && cnt[s.charAt(i)] >= 1){
                cnt[s.charAt(++tt)]--;
            }
            q[++rr] = s.charAt(i);
            cnt[s.charAt(i)]++;
            ans = Math.max(ans,rr - tt);
        }
        System.out.println(ans);
    }
}
