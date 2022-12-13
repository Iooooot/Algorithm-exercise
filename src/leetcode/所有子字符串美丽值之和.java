package leetcode;

/**
 * @author wht
 * @date 2022/12/12 19:03
 */
public class 所有子字符串美丽值之和 {
    public static void main(String[] args) {
        String s = "aaaabbbbcc";
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int[] cnt = new int[26];
            for (int j = i; j < n; ++j) {
                ++cnt[s.charAt(j) - 'a'];
                int mi = 1000, mx = 0;
                for (int v : cnt) {
                    if (v > 0) {
                        mi = Math.min(mi, v);
                        mx = Math.max(mx, v);
                    }
                }
                ans += mx - mi;
            }
        }
        System.out.println(ans);
    }
}
