package leetcode;

/**
 * @author wht
 * @date 2023/2/9 10:40
 */
public class 兼具大小写的最好英文字母 {
    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        int[] dx = new int[26];
        int[] xx = new int[26];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                xx[c - 'a'] = 1;
            }else{
                dx[c - 'A'] = 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(xx[i] == 1 && dx[i] == 1){
                String s1 = String.valueOf((char) ('A' + i));
                ans = ans.compareTo(s1) >= 0 ? ans : s1;
            }
        }
        System.out.println(ans);
    }
}
