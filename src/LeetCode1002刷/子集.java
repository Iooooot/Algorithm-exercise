package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/3/10 12:27
 */
public class 子集 {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ans.add(new ArrayList<>());
        dfs(0,new ArrayList<>(),nums);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }

    private static void dfs(int u,ArrayList<Integer> list, int[] nums) {
        if(u == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[u]);
        dfs(u+1,list,nums);
        list.remove(list.size()-1);
        dfs(u+1,list,nums);
    }
}
