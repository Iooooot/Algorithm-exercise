package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/23 12:02
 */
public class Main_最长上升子序列 {
    private static int[] num = new int[1010];
    private static int[] f = new int[1010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            f[i] = 1;
            for (int j = 1; j < i; j++) {
                if(num[j] < num[i]){
                    f[i] = Math.max(f[i],f[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res,f[i]);
        }
        System.out.println(res);
    }
}
