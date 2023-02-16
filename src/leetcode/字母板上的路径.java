package leetcode;

/**
 * @author wht
 * @date 2023/2/15 14:28
 */
public class 字母板上的路径 {
    public String alphabetBoardPath(String target) {
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        for (int k = 0; k < target.length(); ++k) {
            int v = target.charAt(k) - 'a';
            int x = v / 5, y = v % 5;
            while (j > y) {
                --j;
                ans.append('L');
            }
            while (i > x) {
                --i;
                ans.append('U');
            }
            while (j < y) {
                ++j;
                ans.append('R');
            }
            while (i < x) {
                ++i;
                ans.append('D');
            }
            ans.append("!");
        }
        return ans.toString();
    }
}
