package LeetCode100;

/**
 * @author wht
 * @date 2023/6/30 9:53
 */
public class 目标和 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int len = nums.length;
        int n = 1 << len;
        int sum = 0,res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len; j++) {
                if((i >> j & 1) == 1){
                    sum += nums[j];
                }else{
                    sum -= nums[j];
                }
            }
            if(sum == target){
                res++;
            }
            sum = 0;
        }
        System.out.println(res);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        int n = 1 << len;
        int sum = 0,res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len; j++) {
                if((i >> j & 1) == 1){
                    sum += nums[j];
                }else{
                    sum -= nums[j];
                }
            }
            if(sum == target){
                res++;
            }
            sum = 0;
        }
        return res;
    }
}
