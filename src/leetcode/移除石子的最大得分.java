package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2022/12/21 15:54
 */
public class 移除石子的最大得分 {
    public static void main(String[] args) {
        int a = 4,b = 4,c = 6;
        int[] nums = {a,b,c};
        Arrays.sort(nums);
        int ans = 0;
        while(nums[0] != 0 || nums[1] != 0){
            ans++;
            nums[1]--;
            nums[2]--;
            Arrays.sort(nums);
        }
        System.out.println(ans);
    }
}
