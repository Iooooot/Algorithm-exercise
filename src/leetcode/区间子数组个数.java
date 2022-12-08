package leetcode;

/**
 * @author wht
 * @date 2022/11/24 11:02
 */
public class 区间子数组个数 {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        int left = 2,right = 3;
        int ans = 0,max = -1;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while(j < nums.length){
                if(nums[j] >= left && nums[j] <= right){
                    ans++;
                    max = Math.max(max,nums[j]);
                    j++;
                }else if(nums[j] < max){
                    ans++;
                    j++;
                }else{
                    max = -1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
