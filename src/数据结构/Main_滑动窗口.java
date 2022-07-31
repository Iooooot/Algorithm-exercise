package 数据结构;

import java.util.Scanner;

public class Main_滑动窗口 {
    static int[] que = new int[100010];
    static int[] a = new int[100010];
    static int tt,rr=-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(tt<=rr&&que[tt] < i - k + 1){
                tt++;
            }
            while(tt<=rr&&a[que[rr]]>=a[i]){
                rr--;
            }
            que[++rr] = i;
            if(i >= k - 1)System.out.print(a[que[tt]]+" ");
        }
        System.out.println();
        tt = 0;
        rr = -1;
        for (int i = 0; i < n; i++) {
            if(tt<=rr&&i - k + 1 > que[tt]){
                tt++;
            }
            while(tt<=rr&&a[que[rr]]<=a[i]){
                rr--;
            }
            que[++rr] = i;
            if(i >= k - 1)System.out.print(a[que[tt]]+" ");
        }
    }
}
