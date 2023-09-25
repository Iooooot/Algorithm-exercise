package 剑指offer;

import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2023/9/24 11:16
 */
public class 雇佣K位工人的总代价 {
    public static void main(String[] args) {
        int[] costs = {2,2,2,2,2,2,1,4,5,5,5,5,5,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int k = 7;
        int candidates = 3;
        int len = costs.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }else{
                return a[0] - b[0];
            }
        });
        int l = 0,r = len-1;
        for (l = 0; l < candidates; l++) {
            minHeap.offer(new int[]{0,costs[l]});
            if(len - l - 1 >= candidates){
                r = len - l - 1;
                minHeap.offer(new int[]{1,costs[r]});
            }
        }
        l--;
        long ans = 0L;
        for (int i = 0; i < k; i++) {
            if(!minHeap.isEmpty()){
                int[] t = minHeap.poll();
                ans += t[1];
                if(t[0] == 0){
                    l++;
                    if(l < r){
                        minHeap.offer(new int[]{0,costs[l]});
                    }
                }else{
                    r--;
                    if(l < r){
                        minHeap.offer(new int[]{1,costs[r]});
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
