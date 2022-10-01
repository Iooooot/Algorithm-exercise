package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/29 11:25
 */
public class Main_石子合并 {
    private static int n;
    private static int[] s = new int[310];
    private static int[][] f = new int[310][310];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            s[i] = s[i - 1] + t;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j + i - 1 <= n; j++) {
                int l = j,r = j + i - 1;
                f[l][r] = (int) 1e9;
                for (int k = l; k < r; k++) {
                    f[l][r] = Math.min(f[l][r],f[l][k] + f[k + 1][r] + (s[r] - s[l - 1]));
                }
            }
        }
        System.out.println(f[1][n]);
    }
}
