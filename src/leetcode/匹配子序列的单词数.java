package leetcode;

/**
 * @author wht
 * @date 2022/11/17 10:08
 */
public class 匹配子序列的单词数 {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        int res = 0;
        for (String word : words) {
            if(check(s,word)){
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean check(String s, String word) {
        int len = s.length();
        for (int i = 0,j = 0; i < word.length(); i++) {
            while(j < len && s.charAt(j) != word.charAt(i)){
                j++;
            }
            if(j == len){
                return false;
            }
            if(s.charAt(j) == word.charAt(i)){
                j++;
            }
        }
        return true;
    }
}
