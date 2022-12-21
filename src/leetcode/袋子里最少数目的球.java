package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2022/12/20 17:41
 */
public class 袋子里最少数目的球 {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        while(left < right){
            int mid = (left + right) >> 1;
            long cnt = 0;
            for(int num : nums){
                cnt += (num - 1) / mid;
            }
            if(cnt <= maxOperations){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
