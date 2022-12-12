package leetcode;

/**
 * @author wht
 * @date 2022/12/11 17:27
 */
public class 最少操作使数组递增 {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,1};
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                int t = nums[i-1] + 1 - nums[i];
                ans += t;
                nums[i] += t;
            }
        }
        System.out.println(ans);
    }
}
