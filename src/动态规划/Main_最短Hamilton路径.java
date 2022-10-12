package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/10 9:08
 */
public class Main_最短Hamilton路径 {
    private static int[][] m = new int[25][25];
    private static int[][] f = new int[1<<21][25];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 1<<n; i++) {
            Arrays.fill(f[i],(int)1e9);
        }
        f[1][0] = 0;
        for (int i = 0; i < 1<<n; i++) {
            for (int j = 0; j < n; j++) {
                if((i >> j & 1) == 1){
                    for (int k = 0; k < n; k++) {
                        if(((i - (1 << j)) >> k & 1) == 1){
                            f[i][j] = Math.min(f[i][j],f[i - (1 << j)][k]+m[k][j]);
                        }
                    }
                }
            }
        }
        System.out.println(f[(1 << n) - 1][n-1]);
    }
}
