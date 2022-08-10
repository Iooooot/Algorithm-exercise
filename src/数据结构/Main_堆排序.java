package 数据结构;

import java.util.Scanner;

public class Main_堆排序 {
    private static int[] h = new int[100010];
    private static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        size = n;
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        //初始化堆
        for (int i = n / 2; i >= 1 ; i--) {
            down(i);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(h[1]);
            //删除堆顶
            h[1] = h[size--];
            down(1);
        }
    }

    private static void down(int u) {
        int t = u;
        if(u * 2 <= size && h[t] > h[u * 2]){
            t = 2 * u;
        }
        if(u * 2 + 1 <= size && h[t] > h[u * 2 + 1]){
            t = 2 * u + 1;
        }

        if(t != u){
            int temp = h[u];
            h[u] = h[t];
            h[t] = temp;
            down(t);
        }
    }
}
