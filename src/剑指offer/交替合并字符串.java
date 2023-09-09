package 剑指offer;

/**
 * @author wht
 * @date 2023/8/1 10:19
 */
public class 交替合并字符串 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        StringBuilder sb = new StringBuilder();
        int len = Math.min(word1.length(),word2.length());
        int i = 0;
        for (; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        while(i < word1.length()){
            sb.append(word1.charAt(i++));
        }
        while(i < word2.length()){
            sb.append(word2.charAt(i++));
        }
        System.out.println(sb.toString());
    }
}
