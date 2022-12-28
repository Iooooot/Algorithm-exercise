package leetcode;

/**
 * @author wht
 * @date 2022/12/27 10:05
 */
public class 转换字符串的最少操作次数 {
    public static void main(String[] args) {
        String s = "OOOO";
        StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'X'){
                sb.replace(i,i+3, "OOO");
                ans++;
                i = i + 2;
            }
        }
        System.out.println(ans);
    }
}
