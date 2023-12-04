package leetcode150;

import java.util.HashMap;

/**
 * @author wht
 * @date 2023/12/3 10:30
 */
public class 存在重复元素II {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    System.out.println(true);
                    return;
                }else{
                    map.put(nums[i],i);
                }
            }else{
                map.put(nums[i],i);
            }
        }
    }
}
