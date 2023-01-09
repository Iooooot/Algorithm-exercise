package leetcode;

/**
 * @author wht
 * @date 2023/1/8 10:06
 */
public class 统计包含给定前缀的字符串 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int ans = 0;
        for (String word : words) {
            if(word.length() < pref.length()){
                continue;
            }
            if(pref.equals(word.substring(0,pref.length()))){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
