package leetcode;

/**
 * @author wht
 * @date 2023/7/30 12:49
 */
public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] matrix = {
                {}
        };
        if(matrix.length == 0 || matrix[0].length == 0){
            System.out.println(false);
            return;
        }
        int target = 20;
        int len = matrix.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if(matrix[i][0] > target){
                break;
            }
            int l = 0,r = matrix[i].length-1;
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
