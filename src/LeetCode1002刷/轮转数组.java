package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/23 10:51
 */
public class 轮转数组 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int len = nums.length;
        k = k % len;
        int[] temp = new int[k];
        int cnt = 0;
        for (int i = len-k; i < len; i++) {
            temp[cnt++] = nums[i];
        }
        for (int i = len - k-1; i >= 0; i--) {
            nums[i+k] = nums[i];
        }
        for (int i =0; i < k; i++) {
            nums[i] = temp[i];
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
