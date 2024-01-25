package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/10 9:59
 */
public class 移动零 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int j = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
