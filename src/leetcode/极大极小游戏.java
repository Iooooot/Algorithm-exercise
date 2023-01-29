package leetcode;

/**
 * @author wht
 * @date 2023/1/15 13:54
 */
public class 极大极小游戏 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        for (int i = nums.length; i != 1;i /= 2) {
            for (int j = 0; j < nums.length / 2; j++) {
                nums[j] = j % 2 == 0 ? Math.min(nums[j*2],nums[j*2+1]) : Math.max(nums[j*2],nums[j*2+1]);
            }
        }
        System.out.println(nums[0]);
    }
}
