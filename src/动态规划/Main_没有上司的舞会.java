package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/11 9:06
 */
public class Main_没有上司的舞会 {
    private static int[] happy = new int[6010];
    private static boolean[] st = new boolean[6010];
    private static int[][] f = new int[6010][2];
    private static int idx,n;
    private static int[] h = new int[6010];
    private static int[] e = new int[6010];
    private static int[] ne = new int[6010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            happy[i] = sc.nextInt();
        }
        Arrays.fill(h,-1);
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            st[a] = true;
            insert(b,a);
        }
        int root = 1;
        while(st[root]){
            root++;
        }
        dfs(root);
        System.out.println(Math.max(f[root][1],f[root][0]));
    }

    private static void dfs(int u) {
        f[u][1] = happy[u];
        for (int i = h[u]; i != -1 ; i = ne[i]) {
            int j = e[i];
            dfs(j);
            f[u][1] += f[j][0];
            f[u][0] += Math.max(f[j][0],f[j][1]);
        }

    }

    private static void insert(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
