package LeetCode1002刷;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wht
 * @date 2024/1/22 16:09
 */
public class 合并区间 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int st = intervals[0][0],ed = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= ed){
                ed = Math.max(ed,intervals[i][1]);
            }else{
                ans.add(new int[]{st,ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }
        ans.add(new int[]{st,ed});
        Integer[] objects = (Integer[]) ans.toArray();
        for (int[] an : ans) {
            System.out.println(an[0] + " "+an[1]);
        }
    }
}
