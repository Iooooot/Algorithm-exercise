package leetcode;

/**
 * @author wht
 * @date 2023/3/8 8:52
 */
public class 礼物的最大价值 {
    static private int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
    static private int[][] f;
    private static int[] dx = {0,1};
    private static int[] dy = {1,0};
    public static void main(String[] args) {
        int n = grid.length;
        int m = grid[0].length;
        f = new int[n+1][m+1];
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         f[i][j] = Math.max(f[i-1][j],f[i][j-1]) + grid[i-1][j-1];
        //     }
        // }
        // System.out.println(f[n][m]);
        System.out.println(dp(0,0,n,m));
    }
    private static int dp(int x, int y,int n,int m) {
        if(f[x][y] > 0){
            return f[x][y];
        }
        f[x][y] = grid[x][y];
        for (int i = 0; i < 2; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if(a >= 0 && a < n && b >= 0 && b < m){
                f[x][y] = Math.max(f[x][y],dp(a,b,n,m) + grid[x][y]);
            }
        }
        return f[x][y];
    }
}
