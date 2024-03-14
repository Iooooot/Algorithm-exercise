package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/3/9 10:12
 */
public class 全排列 {
    static List<List<Integer>> ans = new ArrayList<>();
    static boolean[] vis = new boolean[100010];
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        dfs(0,new ArrayList<Integer>(),nums);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }

    private static void dfs(int u, ArrayList<Integer> list, int[] nums) {
        if(u == nums.length){
            ArrayList<Integer> t = new ArrayList<>();
            t.addAll(list);
            ans.add(t);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!vis[i]){
                vis[i] = true;
                list.add(nums[i]);
                dfs(u+1,list,nums);
                list.remove(list.size()-1);
                vis[i] = false;
            }

        }

    }
}
