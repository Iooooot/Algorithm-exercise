package 动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2022/9/15 11:14
 */
public class Main_完全背包问题 {
    private static int[] v = new int[1010];
    private static int[] w = new int[1010];
    private static int[] f = new int[1010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        for (int i =1; i <= n; i++) {
            String[] s1 = reader.readLine().split(" ");
            v[i] = Integer.parseInt(s1[0]);
            w[i] = Integer.parseInt(s1[1]);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = v[i]; j <= m; j++) {
                f[j] = Math.max(f[j],f[j - v[i]] + w[i]);
            }
        }
        System.out.println(f[m]);
    }
}
