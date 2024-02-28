package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/31 11:51
 */
public class 搜索二维矩阵II {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if(matrix[i][0] > target){
                break;
            }
            int l = 0,r = m-1;
            while(l < r){
                int mid = l + r >> 1;
                if(matrix[i][mid] >= target){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }
            if(matrix[i][r] == target){
                System.out.println(true);
                break;
            }
        }
    }
}
