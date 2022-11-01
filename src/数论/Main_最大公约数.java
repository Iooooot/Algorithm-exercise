package 数论;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/31 9:01
 */
public class Main_最大公约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }

    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
