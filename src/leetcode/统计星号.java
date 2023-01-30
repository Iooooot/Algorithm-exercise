package leetcode;

/**
 * @author wht
 * @date 2023/1/29 16:05
 */
public class 统计星号 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        int ans = 0,flag = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                ans += flag;
            } else if (c == '|') {
                flag ^= 1;
            }
        }
        System.out.println(ans);
    }
}
