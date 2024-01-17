package LeetCode1002刷;

import java.util.HashMap;

/**
 * @author wht
 * @date 2024/1/16 10:20
 */
public class 和为k的子数组 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int sum = 0,ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)){
                ans +=  map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }

    private static void dfs(int[] nums, int u,int sum,int target) {
        if(sum == target){
            return;
        }
        if(u == nums.length){
            return;
        }
        dfs(nums,u+1,sum+nums[u],target);
        dfs(nums,u+1,sum,target);
    }
}
