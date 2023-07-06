package LeetCode100;

/**
 * @author wht
 * @date 2023/7/5 10:10
 */
public class 和为K的子数组 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int len = nums.length;
        int[] sum = new int[len+1];
        for (int i = 1; i <= len; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if( sum[j+1] - sum[i] == k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
