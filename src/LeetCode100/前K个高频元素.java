package LeetCode100;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author wht
 * @date 2023/6/23 9:04
 */
public class 前K个高频元素 {
    public static void main(String[] args) {
        int[] nums = {5,3,1,1,1,3,73,1};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((s1,s2) -> s2[1]-s1[1]);
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            queue.add(new int[]{integer,map.get(integer)});
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int[] t = queue.poll();
            res[i] = t[0];
        }
        for (int re : res) {
            System.out.println(re);
        }
    }
}
