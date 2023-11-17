package leetcode150;

/**
 * @author wht
 * @date 2023/11/16 9:34
 */
public class 长度最小的子数组 {
    public static void main(String[] args) {
        int target = 4;
        int[] nums = {1,4,4};
        int len = nums.length;
        int ll = 0,sum = 0,ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans,i-ll+1);
                sum -= nums[ll++];
            }
        }
        if(ans == Integer.MAX_VALUE){
            ans = 0;
        }
        System.out.println(ans);
    }
}
