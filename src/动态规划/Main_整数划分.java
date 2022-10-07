package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/7 19:02
 */
public class Main_整数划分 {
    private static int[] f = new int[1010];
    private static final int MOD = (int) (1e9 + 7);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                f[j] = (f[j] + f[j - i]) % MOD;
            }
        }
        System.out.println(f[n]);
    }
}
