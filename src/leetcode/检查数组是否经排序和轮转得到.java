package leetcode;

/**
 * @author wht
 * @date 2022/11/27 11:58
 */
public class 检查数组是否经排序和轮转得到 {
    public static void main(String[] args) {
        int[] nums = {6,10,6};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                ++cnt;
            }
        }
        return cnt <= 1;
    }
}
