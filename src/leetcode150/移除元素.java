package leetcode150;

/**
 * @author wht
 * @date 2023/10/23 10:06
 */
public class 移除元素 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                int t = nums[cnt];
                nums[cnt] = nums[i];
                nums[i] = t;
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(nums[i]);
        }
    }
}
