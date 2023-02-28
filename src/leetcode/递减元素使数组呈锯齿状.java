package leetcode;

/**
 * @author wht
 * @date 2023/2/27 9:54
 */
public class 递减元素使数组呈锯齿状 {
    public static void main(String[] args) {
        int[] nums = {9,6,1,6,2};
        int[] ans = new int[2];
        int len = nums.length;
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < len; j+=2) {
                int d = 0;
                if(j > 0){
                    d = Math.max(d,nums[j] - nums[j-1] + 1);
                }
                if(j < len - 1){
                    d = Math.max(d,nums[j] - nums[j+1] + 1);
                }
                ans[i] += d;
            }
        }
        System.out.println(Math.min(ans[0],ans[1]));
    }
}
