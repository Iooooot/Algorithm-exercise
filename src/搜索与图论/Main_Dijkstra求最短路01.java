package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Dijkstra求最短路01 {
    private static int n,m;
    private static int[][] g = new int[510][510];
    private static int[] dist = new int[510];
    private static boolean[] vis = new boolean[510];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                g[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            g[x][y] = Math.min(g[x][y],z);
        }
        System.out.println(dijkstra());
    }

    private static int dijkstra() {
        for (int i = 0; i <= n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[1] = 0;

        for (int i = 0; i < n - 1 ; i++) {
            int t  = -1;
            //找最近的边
            for (int j = 1; j <= n; j++) {
                if(!vis[j] && (t == -1 || dist[t] > dist[j])){
                    t = j;
                }
            }

            //根据最短路径的点更新其他距离
            for (int j = 1; j <= n; j++) {
                if(g[t][j] != Integer.MAX_VALUE){
                    dist[j] = Math.min(dist[j],dist[t] + g[t][j]);
                }
            }

            vis[t] = true;
        }

        if(dist[n] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[n];
    }
}
