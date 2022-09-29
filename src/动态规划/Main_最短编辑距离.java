package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/27 15:22
 */
public class Main_最短编辑距离 {
    private static int n,m;
    private static int[][] f = new int[1010][1010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String a = " " + sc.next();
        m = sc.nextInt();
        String b = " " + sc.next();

        for (int i = 0; i <= n; i++) {
            f[i][0] = i;
        }
        for (int i = 0; i <= m; i++) {
            f[0][i] = i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.min(f[i - 1][j] + 1,f[i][j - 1] + 1);
                if(a.charAt(i) == b.charAt(j)){
                    f[i][j] = Math.min(f[i][j],f[i - 1][j - 1]);
                }else{
                    f[i][j] = Math.min(f[i][j],f[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
