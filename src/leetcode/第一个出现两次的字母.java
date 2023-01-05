package leetcode;

/**
 * @author wht
 * @date 2023/1/4 15:38
 */
public class 第一个出现两次的字母 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            cnt[t - 'a']++;
            if(cnt[t-'a'] > 1){
                System.out.println(t);
                break;
            }
        }
    }
}
