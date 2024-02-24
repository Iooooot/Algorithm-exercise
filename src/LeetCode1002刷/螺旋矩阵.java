package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/1/29 10:46
 */
public class 螺旋矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int r = 0,c = 0;
        while(true){
            for (int i = c; i < m; i++) {
                ans.add(matrix[r][i]);
            }
            if(++r == n){
                break;
            }
            for (int i = r; i < n; i++) {
                ans.add(matrix[i][m-1]);
            }
            if(--m == c){
                break;
            }
            for (int i = m-1; i >= c; i--) {
                ans.add(matrix[n-1][i]);
            }
            if(--n == r){
                break;
            }
            for (int i = n-1; i >= r; i--) {
                ans.add(matrix[i][c]);
            }
            if(++c == m){
                break;
            }
        }
        for (Integer an : ans) {
            System.out.println(an);
        }
    }
}
