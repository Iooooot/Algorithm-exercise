package leetcode;

/**
 * @author wht
 * @date 2022/11/29 11:33
 */
public class 生成交替二进制字符串的最少操作数 {
    public static void main(String[] args) {
        String s = "10010100";
        int n = s.length();
        char[] chars = s.toCharArray();
        int[][] f = new int[n][2];
        if(chars[0] == '0'){
            f[0][0] = 0;
            f[0][1] = 1;
        }else{
            f[0][0] = 1;
            f[0][1] = 0;
        }
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == '0'){
                f[i][0] = f[i-1][1];
                f[i][1] = f[i-1][0] + 1;
            }else{
                f[i][0] = f[i-1][1] + 1;
                f[i][1] = f[i-1][0];
            }
        }
        System.out.println(Math.min(f[n-1][0],f[n-1][1]));
    }
}
