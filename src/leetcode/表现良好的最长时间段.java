package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wht
 * @date 2023/2/14 11:22
 */
public class 表现良好的最长时间段 {
    public static void main(String[] args) {
        int[] hours = {9,9,6,0,6,6,9};
        int ans = 0,s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            s += hours[i] > 8 ? 1 : -1;
            if(s > 0){
                ans = i + 1;
            }else if(map.containsKey(s - 1)){
                ans = Math.max(ans,i - map.get(s - 1));
            }
            map.putIfAbsent(s, i);
        }
        System.out.println(ans);
    }
}
