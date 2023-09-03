package 剑指offer;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/8/15 15:55
 */
public class K和数对的最大数目 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        int len = nums.length;
        Arrays.sort(nums);
        int i = 0,j = len-1, ans = 0;
        while(i < j){
            int t = nums[i] + nums[j];
            if(t == k){
                i++;
                j--;
                ans++;
            } else if(t < k){
                i++;
            } else{
                j--;
            }
        }
        System.out.println(ans);

    }
}
