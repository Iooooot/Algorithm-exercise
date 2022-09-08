package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Floyd求最短路 {
    private static int n,m,k;
    private static int INF = (int)1e9;
    private static int[][] g = new int[210][210];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        k = Integer.parseInt(s[2]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j){
                    g[i][j] = 0;
                }else{
                    g[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            g[x][y] = Math.min(g[x][y],z);
        }
        floyd();
        for (int i = 0; i < k; i++) {
            String[] s1 = reader.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            if(g[a][b] > INF / 2) {
                System.out.println("impossible");
            }else{
                System.out.println(g[a][b]);
            }
        }
    }

    private static void floyd() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    g[i][j] = Math.min(g[i][j],g[i][k] + g[k][j]);
                }
            }
        }
    }
}
