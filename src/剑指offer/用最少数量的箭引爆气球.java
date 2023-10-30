package 剑指offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wht
 * @date 2023/10/18 9:17
 */
public class 用最少数量的箭引爆气球 {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int ans = 1,n = points.length;
        int end = points[0][1];
        for (int i = 1; i < n; i++) {
            if(points[i][0] <= end){
                end = Math.min(end,points[i][1]);
            }else{
                ans++;
                end = points[i][1];
            }
        }
        System.out.println(ans);
    }
}
