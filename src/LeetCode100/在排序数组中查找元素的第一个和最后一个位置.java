package LeetCode100;

/**
 * @author wht
 * @date 2023/4/27 9:29
 */
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int l = 0,r = nums.length-1;
        int[] ans = new int[2];
        while(l < r){
            int mid = (l+r) >> 1;
            if(nums[mid] >= target){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        if(nums[l] != target){
            ans[0] = -1;
            ans[1] = -1;
        }else{
            ans[0] = l;
            r = nums.length-1;
            while(l < r){
                int mid = (l+r+1) >> 1;
                if(nums[mid] <= target){
                    l = mid;
                }else{
                    r = mid - 1;
                }
            }
            ans[1] = l;
        }

        for (int an : ans) {
            System.out.println(an);
        }
    }
}
