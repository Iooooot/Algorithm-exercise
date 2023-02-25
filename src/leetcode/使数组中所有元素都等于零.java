package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2023/2/24 9:16
 */
public class 使数组中所有元素都等于零 {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                q.offer(nums[i]);
            }
        }
        Integer t = 0;
        while(!q.isEmpty()){
            t  = q.poll();
            ans++;
            int len = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            while(!q.isEmpty()) {
                Integer t2 = q.poll();
                int temp = t2 - t;
                if(temp != 0){
                    arr.add(temp);
                }
            }
            for (int i : arr) {
                q.offer(i);
            }
        }
        System.out.println(ans);
    }
}
