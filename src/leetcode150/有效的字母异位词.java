package leetcode150;

/**
 * @author wht
 * @date 2023/11/30 10:13
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";

        int[] cnt = new int[30];
        int len1 = s.length();
        int len2 = t.length();
        for (int i = 0; i < len1; i++) {
            cnt[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < len2; i++) {
            cnt[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(cnt[i] < 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
