package leetcode150;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/11/27 10:26
 */
public class 生命游戏 {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};
        int w = board[0].length;
        int h = board.length;
        int[][] temp = new int[h][w];
        for (int i = 0; i < h; i++) {
            temp[i] = Arrays.copyOf(board[i], w);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int cnt = 0;
                for (int k = 0; k < 8; k++) {
                    int tx = i + dx[k];
                    int ty = j + dy[k];
                    if(tx >= 0 && tx < h && ty >= 0 && ty < w && board[tx][ty] == 1){
                        cnt++;
                    }
                }
                if(board[i][j] == 0){
                    if(cnt == 3){
                        temp[i][j] = 1;
                    }
                }else{
                    if(cnt < 2 || cnt > 3){
                        temp[i][j] = 0;
                    } else {
                        temp[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            board[i] = Arrays.copyOf(temp[i], w);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
