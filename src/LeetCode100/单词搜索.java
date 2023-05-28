package LeetCode100;

/**
 * @author wht
 * @date 2023/5/11 9:34
 */
public class 单词搜索 {
    static boolean flag = false;
    static boolean[][] vis = new boolean[10][10];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(!flag){
                        vis[i][j] = true;
                        dfs(i,j,1,board,word);
                        vis[i][j] = false;
                    }else{
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
    }

    private static void dfs(int x,int y,int u,char[][] board, String word) {
        if(u == word.length()){
            flag = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length || vis[tx][ty] || board[tx][ty] != word.charAt(u)){
                continue;
            }
            vis[tx][ty] = true;
            dfs(tx,ty,u+1,board,word);
            vis[tx][ty] = false;
        }
    }
}
