package leetcode;

/**
 * @author wht
 * @date 2022/12/26 10:55
 */
public class 统计同构子字符串的数目 {
    public static void main(String[] args) {
        final int MOD = (int)1e9 + 7;
        String s = "zzzzz";
        long ans = 0;
        for (int i = 0,j = 0; i < s.length(); i++) {
            while(j < s.length() && s.charAt(j) == s.charAt(i)){
                j++;
            }
            int len = j - i;
            ans += (long) (1 + len) * len / 2;;
            ans %= MOD;
            i = j-1;
        }
        System.out.println(ans);
    }
}
