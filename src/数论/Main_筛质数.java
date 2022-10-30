package 数论;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/28 16:06
 */
public class Main_筛质数 {
    private static int res = 0;
    private static boolean[] vis = new boolean[1000010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        get_primes(n);
        System.out.println(res);
    }

    private static void get_primes(int n) {
        for (int i = 2; i <= n; i++) {
            if(!vis[i]){
                res++;
            }
            for (int j = i + i; j <= n; j+=i) {
                vis[j] = true;
            }
        }
    }
}
