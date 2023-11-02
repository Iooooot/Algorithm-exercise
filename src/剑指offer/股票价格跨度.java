package 剑指offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wht
 * @date 2023/10/20 9:15
 */
public class 股票价格跨度 {
    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();
        System.out.println(obj.next(100)); // 返回 1
        System.out.println(obj.next(80));  // 返回 1
        System.out.println(obj.next(60));  // 返回 1
        System.out.println(obj.next(70));  // 返回 2
        System.out.println(obj.next(60));  // 返回 1
        System.out.println(obj.next(75));  // 返回 4 ，因为截至今天的最后 4 个股价 (包括今天的股价 75) 都小于或等于今天的股价。
        System.out.println(obj.next(85));  // 返回 6
    }
    static class StockSpanner {
        Deque<int[]> d = new ArrayDeque<>();
        int cur = 0;
        public StockSpanner() {
        }

        public int next(int price) {
            while (!d.isEmpty() && d.peekLast()[1] <= price){
                d.pollLast();
            }
            int prev = d.isEmpty() ? -1 : d.peekLast()[0];
            int ans = cur - prev;
            d.addLast(new int[]{cur++, price});
            return ans;
        }
    }
}

