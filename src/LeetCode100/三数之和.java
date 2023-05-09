package LeetCode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author wht
 * @date 2023/4/17 13:24
 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        Arrays.sort(nums);
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < len; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < len; j++) {
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int t = -(nums[i] + nums[j]);
                if(map.containsKey(t)){
                    int idx = map.get(t);
                    if(idx > i && idx > j){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(t);
                        ans.add(temp);
                    }
                }
            }
        }
        for (ArrayList<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }

    }
}
