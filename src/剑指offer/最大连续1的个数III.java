package 剑指offer;

/**
 * @author wht
 * @date 2023/8/19 10:39
 */
public class 最大连续1的个数III {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int res = 0;
        int left = 0, right = 0;
        int zeros = 0;
        while (right < nums.length) {
            if (nums[right] == 0){
                zeros ++;
            }
            while (zeros > k) {
                if (nums[left++] == 0){
                    zeros --;
                }
            }
            res = Math.max(res, right - left + 1);
            right ++;
        }
        System.out.println(res);
    }
}
