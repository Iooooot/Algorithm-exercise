package leetcode150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2023/11/22 9:15
 */
public class 螺旋矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int u = 0, d = matrix.length - 1;
        int l = 0, r = matrix[0].length - 1;

        while (true) {
            for (int i = l; i <= r; i++) { // 左->右
                ans.add(matrix[u][i]);
            }
            if (++u > d) {
                break;
            }
            for (int i = u; i <= d; i++) { // 上->下
                ans.add(matrix[i][r]);
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; i--) { // 右->左
                ans.add(matrix[d][i]);
            }
            if (--d < u) {
                break;
            }
            for (int i = d; i >= u; i--) { // 下->上
                ans.add(matrix[i][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return;
    }
}
