package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/22 10:31
 */
public class Main_数字三角形 {
    private static int[][] num = new int[510][510];
    private static int[][] f = new int[510][510];
    private static final int INF = (int) 1e9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                f[i][j] = -INF;
            }
        }


        f[1][1] = num[1][1];

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i][j] = Math.max(f[i-1][j-1] + num[i][j],f[i - 1][j] + num[i][j]);
            }
        }
        int res = -INF;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res,f[n][i]);
        }
        System.out.println(res);
    }
}
