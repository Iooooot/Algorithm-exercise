package 剑指offer;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2023/9/23 14:47
 */
public class 最大子序列的分数 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int k = 3;
        int n = nums1.length;

        Integer [] idxs = new Integer[n];
        for (int i = 0; i < n; i ++){
            idxs[i] = i;
        }
        // 让nums2从大到小排序
        Arrays.sort(idxs, (i, j) -> nums2[j] - nums2[i]);
        long res = 0L;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum1 = 0L;
        for (int idx: idxs){
            // 根据索引获取数据
            int x = nums1[idx];
            int y = nums2[idx];
            // 只需要在堆中装k个数，并且是k个最大的数
            while (minHeap.size() > k - 1){
                sum1 -= minHeap.poll();
            }
            minHeap.offer(x);
            sum1 += x;

            if (minHeap.size() == k){
                long cur = sum1 * y;
                res = Math.max(res, cur);
            }
        }
    }
}
