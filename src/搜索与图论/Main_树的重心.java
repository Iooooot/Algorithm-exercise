package 搜索与图论;

import java.util.Scanner;

public class Main_树的重心 {
    private static int ans = 2*100010;
    private static int n;
    private static int[] h = new int[100010];
    private static int[] e = new int[2*100010];
    private static int[] ne = new int[2*100010];
    private static boolean[] vis = new boolean[100010];
    private static int idx;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            h[i] = -1;
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            insert(a,b);
            insert(b,a);
        }
        dfs(1);
        System.out.println(ans);
    }

    private static int dfs(int u) {
        vis[u] = true;
        int size = 0,sum = 0;
        for (int i = h[u]; i != -1 ; i = ne[i]) {
            int j = e[i];
            if(vis[j]){
                continue;
            }
            int s = dfs(j);
            size = Math.max(size,s);
            sum += s;
        }
        size = Math.max(size,n - sum - 1);
        ans = Math.min(size,ans);
        return sum + 1;
    }

    private static void insert(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
