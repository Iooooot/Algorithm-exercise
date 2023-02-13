package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/2/11 22:18
 */
public class 装满杯子需要的最短总时长 {
    public static void main(String[] args) {
        int[] amount = {1,4,2};
        int ans = 0;
        while(amount[0] + amount[1] + amount[2] > 0){
            Arrays.sort(amount);
            ans++;
            amount[1]--;
            amount[2]--;
        }
        if(amount[2] > 0){
            ans += amount[2];
        }
        System.out.println(ans);
    }
}
