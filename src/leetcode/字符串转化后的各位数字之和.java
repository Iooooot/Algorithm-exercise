package leetcode;

/**
 * @author wht
 * @date 2022/12/15 18:07
 */
public class 字符串转化后的各位数字之和 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a' + 1;
            sb.append(t);
        }
        long ans = 0;
        for (int i = 0; i < k && sb.length() >1; i++) {
            ans = 0;
            for (int j = 0; j < sb.length(); j++) {
                ans += Long.parseLong(sb.charAt(j) + "");
            }
            sb = new StringBuilder(ans+"");
        }
        System.out.println(ans);
    }
}
