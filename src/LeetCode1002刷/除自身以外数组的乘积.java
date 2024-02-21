package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/25 10:10
 */
public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int len = nums.length;
        int[] ans = new int[len];
        int[] l = new int[len];
        int[] r = new int[len];
        l[0] = nums[0];
        r[len-1] = nums[len-1];
        for (int i = 1; i < len; i++) {
            l[i] = l[i-1] * nums[i];
        }
        for (int i = len-2; i >= 0; i--) {
            r[i] = r[i+1] * nums[i];
        }
        for (int i = 0; i < len; i++) {
            if(i == 0){
                ans[i] = r[i+1];
            }else if(i == len-1){
                ans[i] = l[i-1];
            }else{
                ans[i] = l[i-1]*r[i+1];
            }
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
