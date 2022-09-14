package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_二分图的最大匹配数 {
    private static int n1,n2,m,idx;
    private static final int N = 510,M = 100010;
    private static int[] h = new int[N];
    private static int[] e = new int[M];
    private static int[] ne = new int[M];
    private static int[] match = new int[N];
    private static boolean[] vis = new boolean[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n1 = Integer.parseInt(s[0]);
        n2 = Integer.parseInt(s[1]);
        m = Integer.parseInt(s[2]);
        Arrays.fill(h,-1);
        for (int i = 0; i < m; i++) {
            String[] s1 = reader.readLine().split(" ");
            int u = Integer.parseInt(s1[0]);
            int v = Integer.parseInt(s1[1]);
            add(u,v);
        }
        int res = 0;
        for (int i = 1; i <= n1; i++) {
            Arrays.fill(vis,false);
            if(find(i)){
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean find(int u) {
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if(!vis[j]){
                vis[j] = true;
                if(match[j] == 0 || find(match[j])){
                    match[j] = u;
                    return true;
                }
            }
        }
        return false;
    }

    private static void add(int u, int v) {
        e[idx] = v;
        ne[idx] = h[u];
        h[u] = idx++;
    }
}
