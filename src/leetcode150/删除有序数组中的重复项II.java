package leetcode150;

/**
 * @author wht
 * @date 2023/11/1 9:35
 */
public class 删除有序数组中的重复项II {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int len = nums.length;
        int cnt = 1,idx = 1;
        for (int i = 1; i < len; i++) {
            if(nums[i] == nums[i-1]){
                cnt++;
                if(cnt <= 2){
                    if(i != idx){
                        nums[idx] = nums[i];
                    }
                    idx++;
                }
            }else{
                if(i != idx){
                    nums[idx] = nums[i];
                }
                cnt = 1;
                idx++;
            }
        }
        System.out.println(idx);
    }
}
