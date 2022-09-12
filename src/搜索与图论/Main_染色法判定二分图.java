package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_染色法判定二分图 {
    private static int n,m,idx;
    private static final int N = 100010;
    private static final int M = 100010 * 2;
    private static int[] h = new int[N];
    private static int[] e = new int[M];
    private static int[] ne = new int[M];
    private static int[] color = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Arrays.fill(h,-1);
        for (int i = 0; i < m; i++) {
            String[] s1 = reader.readLine().split(" ");
            int u = Integer.parseInt(s1[0]);
            int v = Integer.parseInt(s1[1]);
            add(u,v);
            add(v,u);
        }
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if(color[i] == 0){
                if(!dfs(i,1)){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean dfs(int u, int x) {
        color[u] = x;
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if(color[j] == 0){
                if(!dfs(j,3 - x)){
                    return false;
                }
            }else if(color[j] == x){
                return false;
            }
        }
        return true;
    }

    private static void add(int u, int v) {
        e[idx] = v;
        ne[idx] = h[u];
        h[u] = idx++;
    }
}
