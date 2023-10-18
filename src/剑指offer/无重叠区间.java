package 剑指offer;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/10/17 9:57
 */
public class 无重叠区间 {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{1,2},{1,2}};
        Arrays.sort(intervals, (interval1, interval2) -> interval1[1] - interval2[1]);
        int end=intervals[0][1];
        int ans = 1;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= end){
                ans++;
                end = intervals[i][1];
            }
        }
        System.out.println(intervals.length-ans);
    }
}
