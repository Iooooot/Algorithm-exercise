package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/3/11 9:07
 */
public class 组合总和 {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        dfs(0,new ArrayList<Integer>(),candidates,target);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }

    private static void dfs(int u, ArrayList<Integer> list, int[] candidates, int target) {
        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = u; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(i,list,candidates,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
