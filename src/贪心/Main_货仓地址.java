package 贪心;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/24 8:47
 */
public class Main_货仓地址 {
    private static int[] a = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(a,(int) 1e9);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.abs(a[i] - a[n/2]);
        }
        System.out.println(res);
    }
}
