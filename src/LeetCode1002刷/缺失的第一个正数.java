package LeetCode1002刷;

import java.util.HashSet;

/**
 * @author wht
 * @date 2024/1/26 10:15
 */
public class 缺失的第一个正数 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            min = Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        if(min > 1){
            System.out.println(1);
        }else{
            int t = 1;
            while(set.contains(t)){
                    t++;
            }
            System.out.println(t);
        }
    }
}
