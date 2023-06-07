package LeetCode100;

import java.util.LinkedList;

/**
 * @author wht
 * @date 2023/6/6 9:52
 */
public class 岛屿数量 {
    static boolean vis[][] = new boolean[305][305];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n,m,ans;
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == '1' && !vis[i][j]){
                    bfs(grid,i,j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static void bfs(char[][] grid, int x, int y) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        vis[x][y] = true;
        while(!queue.isEmpty()){
            int[] t = queue.poll();
            for (int i = 0; i < 4; i++) {
                int tx = t[0] + dx[i];
                int ty = t[1] + dy[i];
                if (tx < 0 || tx >= n || ty < 0 || ty >= m) {
                    continue;
                }
                if (vis[tx][ty]) {
                    continue;
                }
                if (grid[tx][ty] == '0')
                {
                    continue;
                }
                queue.offer(new int[]{tx,ty});
                vis[tx][ty] = true;
            }
        }
    }
}
