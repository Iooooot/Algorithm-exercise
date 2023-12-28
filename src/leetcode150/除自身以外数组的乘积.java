package leetcode150;

/**
 * @author wht
 * @date 2023/11/3 10:02
 */
public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int sum = 1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum *= nums[i];
        }
        int[] ans = new int[len];

        for (int an : ans) {
            System.out.println(an);
        }
    }
}
