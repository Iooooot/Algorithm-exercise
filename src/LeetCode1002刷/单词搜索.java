package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/3/13 9:45
 */
public class 单词搜索 {
    static int n,m;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] vis = new boolean[10][10];
    static boolean flag = false;
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        n = board.length;
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)){
                    vis[i][j] = true;
                    dfs(i,j,1,word,board);
                    vis[i][j] = false;
                    if(flag){
                        System.out.println(true);
                    }
                }
            }
        }
        System.out.println(false);
    }

    private static void dfs(int x,int y,int u,String word, char[][] board) {
        if(u == word.length()){
            flag = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx >= 0 && tx < n && ty >= 0 && ty < m && !vis[tx][ty] && board[tx][ty] == word.charAt(u)){
                vis[tx][ty] = true;
                dfs(tx,ty,u+1,word,board);
                vis[tx][ty] = false;
            }
        }
    }
}
