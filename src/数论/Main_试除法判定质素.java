package 数论;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/27 9:17
 */
public class Main_试除法判定质素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean flag = true;
            if(x < 2){
                flag = false;
            }
            for (int j = 2; j <= x / j; j++) {
                if(x % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
