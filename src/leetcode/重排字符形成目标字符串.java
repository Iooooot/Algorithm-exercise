package leetcode;

/**
 * @author wht
 * @date 2023/1/13 11:31
 */
public class 重排字符形成目标字符串 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < target.length(); i++) {
            num2[target.charAt(i) - 'a']++;
        }
        int ans = s.length();
        for (int i = 0; i < target.length(); i++) {
            int t = target.charAt(i) - 'a';
            ans = Math.min(num1[t]/num2[t],ans);
        }
        System.out.println(ans);
    }
}
