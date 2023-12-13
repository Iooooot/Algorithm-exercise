package leetcode150;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/11/23 10:04
 */
public class 矩阵置零 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        boolean[] col = new boolean[205];
        boolean[] row = new boolean[205];
        int len = matrix.length;
        int len2 = matrix[0].length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
                if(matrix[i][j] == 0){
                    col[j] = true;
                    row[i] = true;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if(row[i]){
                Arrays.fill(matrix[i],0);
            }else{
                for (int j = 0; j < len2; j++) {
                    if(col[j]){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

    }
}
