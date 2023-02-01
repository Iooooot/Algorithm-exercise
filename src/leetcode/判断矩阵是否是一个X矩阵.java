package leetcode;

/**
 * @author wht
 * @date 2023/1/31 11:11
 */
public class 判断矩阵是否是一个X矩阵 {
    public static void main(String[] args) {
        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        boolean flag = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == j || i == grid[i].length-1 - j){
                    if(grid[i][j] == 0){
                        flag = false;
                    }
                }else{
                    if(grid[i][j] != 0){
                        flag = false;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
