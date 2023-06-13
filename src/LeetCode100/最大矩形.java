package LeetCode100;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wht
 * @date 2023/5/16 9:31
 */
public class 最大矩形 {
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        int n = matrix.length, m = matrix[0].length;
        int[][] sum = new int[n + 10][m + 10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    sum[i][j] = (j == 0 ? 0: sum[i][j - 1]) + 1;
                }
            }
        }

        int len = m;
        int[] right = new int[len+1];
        int[] left = new int[len+1];
        int ans = 0;
        for (int j = 0; j < n; j++) {
            Deque<Integer> deque = new ArrayDeque<>();
            int[] heights = sum[j];
            for (int i = 0; i < len; i++) {
                while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                    deque.pop();
                }
                left[i] = deque.isEmpty() ? -1 : deque.peek();
                deque.push(i);
            }
            deque.clear();
            for (int i = len-1; i > 1; i--) {
                while(!deque.isEmpty() && heights[deque.peek()] >= heights[i]){
                    deque.pop();
                }
                right[i] = deque.isEmpty() ? len : deque.peek();
                deque.push(i);
            }
            for (int i = 0; i < len; i++) {
                ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
            }
        }
        System.out.println(ans);
    }
}
