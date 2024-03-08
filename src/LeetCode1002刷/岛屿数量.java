package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/3/7 9:59
 */
public class 岛屿数量 {
    static boolean[][] vis = new boolean[305][305];
    static int _x,_y,ans = 0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        _x = grid.length;
        _y = grid[0].length;

        for (int i = 0; i < _x; i++) {
            for (int j = 0; j < _y; j++) {
                if(!vis[i][j] && grid[i][j] == '1'){
                    vis[i][j] = true;
                    dfs(i,j,grid);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int x, int y,char[][] grid) {
        for (int i = 0; i < 4; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx >= 0 && tx < _x && ty >= 0 && ty < _y && !vis[tx][ty] && grid[tx][ty] == '1'){
                vis[tx][ty] = true;
                dfs(tx,ty,grid);
            }
        }
    }
}
