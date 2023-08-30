package 剑指offer;

/**
 * @author wht
 * @date 2023/8/7 10:25
 */
public class 反转字符串中的单词 {
    public static void main(String[] args) {
        String s = "a good   example";
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;     // 搜索首个空格
            }
            res.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        System.out.println(res.toString().trim());
    }
}
