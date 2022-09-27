package 动态规划;

import java.util.Scanner;


public class Main_最长公共子序列 {
    private static int n,m;
    private static int[][] f = new int[1010][1010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String a = " " + sc.next();
        String b = " " + sc.next();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i-1][j],f[i][j-1]);
                if(a.charAt(i) == b.charAt(j)){
                    f[i][j] = Math.max(f[i][j],f[i-1][j-1] + 1);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
