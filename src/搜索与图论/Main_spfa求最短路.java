package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_spfa求最短路 {
    private static int n,m,idx;
    static int max = (int)1e9;
    private static final int N = 100010;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] w = new int[N];
    private static int[] ne = new int[N];
    private static int[] dist = new int[N];
    private static boolean[] vis = new boolean[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        Arrays.fill(h,-1);
        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            add(x,y,z);
        }
        spfa();
        if(dist[n] == max){
            System.out.println("impossible");
        }else{
            System.out.println(dist[n]);
        }
    }

    private static void spfa() {
        Arrays.fill(dist,max);
        dist[1] = 0;
        vis[1] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(q.size() != 0){
            int t = q.poll();
            vis[t] = false;
            for (int i = h[t]; i != -1 ; i = ne[i]) {
                int j = e[i];
                if(dist[j] > dist[t] + w[i]){
                    dist[j] = dist[t] + w[i];
                    if(!vis[j]){
                        q.add(j);
                        vis[j] = true;
                    }
                }
            }
        }
    }

    private static void add(int x, int y, int z) {
        e[idx] = y;
        w[idx] = z;
        ne[idx] = h[x];
        h[x] = idx++;
    }
}
