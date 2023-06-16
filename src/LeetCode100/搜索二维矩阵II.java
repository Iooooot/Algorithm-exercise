package LeetCode100;

/**
 * @author wht
 * @date 2023/6/14 10:53
 */
public class 搜索二维矩阵II {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 20;
        int n = matrix.length;
        int m = matrix[0].length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int l = 0,r = m-1;
            while(l < r){
                int mid = l + r >> 1;
                if(matrix[i][mid] >= target){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }
            if(matrix[i][l] == target){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
