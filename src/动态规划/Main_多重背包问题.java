package 动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2022/9/16 10:06
 */
public class Main_多重背包问题 {
    private static int n,m;
    private static int[] v = new int[110];
    private static int[] w = new int[110];
    private static int[] s = new int[110];
    private static int[][] f = new int[110][110];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        for (int i = 1; i <= n; i++) {
            String[] s1 = reader.readLine().split(" ");
            v[i] = Integer.parseInt(s1[0]);
            w[i] = Integer.parseInt(s1[1]);
            s[i] = Integer.parseInt(s1[2]);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= s[i]; k++) {
                    if(k * v[i] <= j){
                        f[i][j] = Math.max(f[i][j],f[i - 1][j - k*v[i]] + k*w[i]);
                    }
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
