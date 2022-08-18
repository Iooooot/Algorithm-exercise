package 搜索与图论;

import java.util.Scanner;

public class Main_排列数字 {
    private static int n;
    private static int[] num = new int[10];
    private static boolean[] vis = new boolean[10];
    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        dfs(0);
    }

    private static void dfs(int u) {
        if(u == n){
            for (int i = 0; i < n; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n ; i++){
            if(!vis[i]){
                num[u] = i;
                vis[i] = true;
                dfs(u+1);
                vis[i] = false;
            }
        }
    }
}
