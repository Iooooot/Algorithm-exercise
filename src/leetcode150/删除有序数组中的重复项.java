package leetcode150;

/**
 * @author wht
 * @date 2023/10/24 9:47
 */
public class 删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int cnt = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(i == 0){
                cnt++;
            }
            if(nums[i] != nums[cnt-1]){
                int t = nums[i];
                nums[i] = nums[cnt];
                nums[cnt++] = t;
            }
        }
        System.out.println(cnt);
    }
}
