package LeetCode1002刷;

import java.util.Arrays;

/**
 * @author wht
 * @date 2024/1/9 14:05
 */
public class 最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        int n = nums.length;
        Arrays.sort(nums);
        int max = 1,cnt = 1;
        for (int i = 0; i < n; i++) {
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                cnt++;
                max = Math.max(cnt,max);
            }else{
                cnt = 1;
            }
        }
        System.out.println(max);
    }
}
