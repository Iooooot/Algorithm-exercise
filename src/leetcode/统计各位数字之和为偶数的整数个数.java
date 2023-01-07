package leetcode;

/**
 * @author wht
 * @date 2023/1/6 10:52
 */
public class 统计各位数字之和为偶数的整数个数 {
    public static void main(String[] args) {
        int num = 999;
        int ans = 0;
        for (int i = 2; i <= num; i++) {
            int sum = getSum(i);
            if(sum % 2 == 0){
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static int getSum(int a) {
        int t = 0;
        while (a != 0){
            t += (a%10);
            a /= 10;
        }
        return t;
    }
}
