package LeetCode1002刷;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wht
 * @date 2024/1/12 9:20
 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0) {
                System.out.println(result);
                return;
            }

            //数据a去重
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    //数据去重
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }

            }
        }
        System.out.println(result);
    }
}
