package LeetCode100;

/**
 * @author wht
 * @date 2023/5/23 10:08
 */
public class 买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int len = prices.length;
        int min = Integer.MAX_VALUE,ans = 0;
        for (int i = 0; i < len; i++) {
            if(prices[i] < min){
                min = prices[i];
            }else{
                ans = Math.max(ans,prices[i] - min);
            }
        }
        System.out.println(ans);
    }
}
