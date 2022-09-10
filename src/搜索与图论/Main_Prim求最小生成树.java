package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_Prim求最小生成树 {
    private static int n,m;
    private static final int INF = (int)1e9;
    private static int[][] g = new int[510][510];
    private static int[] dist = new int[510];
    private static boolean[] vis = new boolean[510];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for(int i=1;i<=n;i++){
            Arrays.fill(g[i],INF);
        }

        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            g[x][y] = g[y][x] = Math.min(g[x][y],z);
        }
        int t = prim();
        if(t == INF){
            System.out.println("impossible");
        }else{
            System.out.println(t);
        }
    }

    private static int prim() {
        Arrays.fill(dist,INF);
        dist[1] = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            //寻找最小的点
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if(!vis[j] && (t == -1 || dist[t] > dist[j])){
                    t = j;
                }
            }
            if(dist[t] == INF){
                return INF;
            }
            res += dist[t];
            vis[t] = true;

            for (int j = 1; j <= n; j++) {
                dist[j] = Math.min(dist[j],g[t][j]);
            }
        }
        return res;
    }

}
