package 数论;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/27 9:23
 */
public class Main_分解质因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            divide(x);
        }
    }

    private static void divide(int x) {
        for(int i = 2 ; i <= x / i ; i ++ ){
            if(x % i == 0){
                int s = 0;
                while(x % i == 0){
                    x /= i;
                    s++;
                }
                System.out.println(i+" "+s);
            }
        }
        if(x > 1){
            System.out.println(x+" " +"1");
        }
        System.out.println();
    }
}
