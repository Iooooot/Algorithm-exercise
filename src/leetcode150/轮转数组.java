package leetcode150;

/**
 * @author wht
 * @date 2023/10/26 9:19
 */
public class 轮转数组 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        int len = nums.length;
        k %= len;
        k = len - k;
        int[] t = new int[k];
        for (int i = 0; i <  k; i++) {
            t[i] = nums[i];
        }
        for (int i =  k; i < len; i++) {
            nums[i-k] = nums[i];
        }
        for (int i = len - k,j = 0; i < len; i++,j++) {
            nums[i] = t[j];
        }
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
