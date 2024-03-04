package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/21 10:57
 */
public class 最大子数组和 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]+nums[i] > 0 && nums[i-1] > 0){
                nums[i] += nums[i-1];
            }
            ans = Math.max(ans,nums[i]);
        }
        System.out.println(ans);
    }
}
