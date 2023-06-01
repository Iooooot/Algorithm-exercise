package LeetCode100;

/**
 * @author wht
 * @date 2023/5/31 9:51
 */
public class 乘积最大子数组 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        System.out.println(max);
    }
}
