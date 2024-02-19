package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/30 10:31
 */
public class 旋转图像 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        int m = matrix[0].length;
        // 垂直翻转
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < m; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = t;
            }
        }
        // 对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}
