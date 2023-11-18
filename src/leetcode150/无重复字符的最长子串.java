package leetcode150;

/**
 * @author wht
 * @date 2023/11/17 9:19
 */
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s= "aab";
        int[] cnt = new int[250];
        int ans = 0,l = 0,i;
        for (i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            cnt[c]++;
            while(cnt[c] > 1){
                ans = Math.max(ans,i - l);
                cnt[s.charAt(l)]--;
                l++;
            }
        }
        ans = Math.max(ans,i -l);
        System.out.println(ans);
    }
}
