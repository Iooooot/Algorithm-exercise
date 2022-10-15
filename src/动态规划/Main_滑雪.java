package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/12 9:49
 */
public class Main_滑雪 {
    private static int n,m;
    private static int[][] map = new int[310][310];
    private static int[][] f = new int[310][310];
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i],-1);
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                res = Math.max(res,dp(i,j));
            }
        }
        System.out.println(res);
    }

    private static int dp(int x, int y) {
        if(f[x][y] != -1){
            return f[x][y];
        }
        f[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if(map[x][y] > map[a][b] && a > 0 && a <= n && b > 0 && b <= m){
                f[x][y] = Math.max(f[x][y],dp(a,b) + 1);
            }
        }
        return f[x][y];
    }
}
