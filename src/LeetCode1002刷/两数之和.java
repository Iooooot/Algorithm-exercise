package LeetCode1002刷;

import java.util.HashMap;

/**
 * @author wht
 * @date 2024/1/8 14:31
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int t = target - nums[i];
            if(t != nums[i] && map.containsKey(t)){
                System.out.println(i+ " " + map.get(t));
                break;
            }
        }
    }
}
