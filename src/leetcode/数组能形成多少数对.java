package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/2/16 9:51
 */
public class 数组能形成多少数对 {
    public static void main(String[] args) {
        int[] nums = {0};
        Arrays.sort(nums);
        int ans1 = 0,ans2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length-1 && nums[i] == nums[i+1]){
                ans1++;
                i++;
            }else{
                ans2++;
            }
        }
        System.out.println(ans1+" "+ans2);
    }
}
