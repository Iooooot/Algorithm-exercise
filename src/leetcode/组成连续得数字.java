package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/2/5 19:55
 */
public class 组成连续得数字 {

    public int getAns(int[] coins){
        int res = 1;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > res) {
                break;
            }
            res += i;
        }
        return res;
    }

}
