package 动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2022/9/16 10:21
 */
public class Main_多重背包问题优化 {
    private static int n,m;
    private static int[] v = new int[110];
    private static int[] w = new int[110];
    private static int[] s = new int[110];
    private static int[] f = new int[110];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String[] s1 = reader.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            int c = Integer.parseInt(s1[2]);
            int k = 1;
            while(k <= c){
                cnt++;
                v[cnt] = a * k;
                w[cnt] = b * k;
                c -= k;
                k *= 2;
            }
            if(c > 0){
                cnt++;
                v[cnt] = a * c;
                w[cnt] = b * c;
            }
        }
        for (int i = 1; i <= cnt; i++) {
            for (int j = m; j >= v[i]; j--) {
                f[j] = Math.max(f[j],f[j - v[i]] + w[i]);
            }
        }
        System.out.println(f[m]);
    }
}
