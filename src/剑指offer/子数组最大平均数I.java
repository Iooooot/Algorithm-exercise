package 剑指offer;

/**
 * @author wht
 * @date 2023/8/17 11:15
 */
public class 子数组最大平均数I {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int n = nums.length,sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int ans = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i-k] + nums[i];
            ans = Math.max(ans,sum);
        }
        System.out.println(ans/k);
    }
}
