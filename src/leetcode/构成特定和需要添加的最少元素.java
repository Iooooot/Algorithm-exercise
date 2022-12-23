package leetcode;

/**
 * @author wht
 * @date 2022/12/22 15:18
 */
public class 构成特定和需要添加的最少元素 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,5,1,-2};
        int limit = 5;
        int goal = 126614243;
        long sum = 0;
        for (int v : nums) {
            sum += v;
        }
        long t = Math.abs(sum - goal);
        System.out.println((int) Math.ceil(t * 1.0/limit));
    }
}
