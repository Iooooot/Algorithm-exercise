package leetcode;

/**
 * @author wht
 * @date 2023/7/21 10:31
 */
public class 去除重复字母 {
    public static void main(String[] args) {
        String s = "bcabc";
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];
        boolean[] vis = new boolean[26];
        for (int i = 0; i < len; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(!vis[c-'a']){
                while(sb.length() > 0 && sb.charAt(sb.length()-1) > c){
                    if(cnt[sb.charAt(sb.length()-1) - 'a'] > 0){
                        vis[sb.charAt(sb.length()-1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    }else{
                        break;
                    }
                }
                vis[c-'a'] = true;
                sb.append(c);
            }
            cnt[c-'a']--;
        }
        System.out.println(sb.toString());
    }
}
