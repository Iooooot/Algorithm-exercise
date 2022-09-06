package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_spfa判断负环 {
    private static int n,m,idx;
    private static int[] h = new int[2010];
    private static int[] e = new int[10010];
    private static int[] w = new int[10010];
    private static int[] ne = new int[10010];
    private static int[] dist = new int[2010];
    private static int[] cnt = new int[2010];
    private static boolean[] vis = new boolean[2010];
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
        if(spfa()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean spfa() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
            vis[i] = true;
        }
        while(q.size() != 0){
            int t = q.poll();
            vis[t] = false;

            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                if(dist[j] > dist[t] + w[i]){
                    dist[j] = dist[t] + w[i];
                    cnt[j] = cnt[t] + 1;
                    if(cnt[j] >= n) {
                        return true;
                    }
                    if(!vis[j]){
                        q.add(j);
                        vis[j] = true;
                    }
                }
            }
        }
        return false;
    }

    private static void add(int x, int y, int z) {
        e[idx] = y;
        w[idx] = z;
        ne[idx] = h[x];
        h[x] = idx++;
    }
}
