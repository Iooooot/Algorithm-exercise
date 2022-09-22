package 动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2022/9/19 15:26
 */
public class Main_分组背包 {
    private static int n,m;
    private static int[][] w = new int[110][110];
    private static int[][] v = new int[110][110];
    private static int[] f = new int[110];
    private static int[] s = new int[110];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" ");
        n = Integer.parseInt(s1[0]);
        m = Integer.parseInt(s1[1]);
        for (int i = 1; i <= n; i++) {
            s[i] = Integer.parseInt(reader.readLine().split(" ")[0]);
            for (int j = 0; j < s[i]; j++) {
                String[] s2 = reader.readLine().split(" ");
                v[i][j] = Integer.parseInt(s2[0]);
                w[i][j] = Integer.parseInt(s2[1]);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 0; j--) {
                for (int k = 0; k < s[i]; k++) {
                    if(v[i][k] <= j){
                        f[j] = Math.max(f[j],f[j - v[i][k]] + w[i][k]);
                    }
                }
            }
        }
        System.out.println(f[m]);
    }
}
