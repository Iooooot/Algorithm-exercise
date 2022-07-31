package 数据结构;

import java.util.Scanner;

public class Main_单调栈 {
    static int[] stk = new int[100010];
    static int tt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            while(tt > 0 && stk[tt-1] >= num){
                tt--;
            }
            if(tt == 0){
                System.out.print("-1 ");
            }else{
                System.out.print(stk[tt-1]+" ");
            }
            stk[tt++] = num;
        }
    }
}
