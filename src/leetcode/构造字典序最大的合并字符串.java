package leetcode;

/**
 * @author wht
 * @date 2022/12/25 11:39
 */
public class 构造字典序最大的合并字符串 {
    public static void main(String[] args) {
        String word1 = "abcabc";
        String word2 = "abdcaba";
        StringBuilder sb = new StringBuilder();
        while(word1.length() + word2.length() > 0) {
            if (word1.compareTo(word2) > 0) {
                sb.append(word1.charAt(0));
                word1 = word1.substring(1);
            } else {
                sb.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }

        System.out.println(sb.toString());
    }
}
