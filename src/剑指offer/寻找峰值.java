package 剑指offer;

/**
 * @author wht
 * @date 2023/9/27 10:10
 */
public class 寻找峰值 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            if (i - 1 >= 0) {
                if (nums[i - 1] >= nums[i]) {
                    ok = false;
                }
            }
            if (i + 1 < n) {
                if (nums[i + 1] >= nums[i]) {
                    ok = false;
                }
            }
            if (ok) {
                return i;
            }
        }
        return -1;
    }
}
