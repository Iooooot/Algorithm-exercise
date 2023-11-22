package leetcode150;

/**
 * @author wht
 * @date 2023/11/21 10:06
 */
public class 有效的数独 {
    public static void main(String[] args) {
        char[][] board =    {{'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};
        boolean[][] col = new boolean[10][10];
        boolean[][] row = new boolean[10][10];
        boolean[][][] sq = new boolean[4][4][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] <= '9' && board[i][j] >= '1'){
                    int num = board[i][j] - '1' + 1;
                    int x = i / 3;
                    int y = j / 3;
                    if(col[j][num] || row[i][num] || sq[x][y][num]){
                        System.out.println(false);
                        return;
                    }else{
                        col[j][num] = true;
                        row[i][num] = true;
                        sq[x][y][num] = true;
                    }
                }
            }
        }
        System.out.println(true);
    }
}
