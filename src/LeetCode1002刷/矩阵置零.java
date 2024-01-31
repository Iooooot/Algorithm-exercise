package LeetCode1002刷;

import java.util.Arrays;

/**
 * @author wht
 * @date 2024/1/27 10:28
 */
public class 矩阵置零 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(row[i]){
                Arrays.fill(matrix[i],0);
            }else{
                for (int j = 0; j < m; j++) {
                    if(col[j]){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
