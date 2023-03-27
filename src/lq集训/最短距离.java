package lq集训;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/22 18:45
 */
public class 最短距离 {
    static int n,m,idx;
    static int[] h = new int[100010];
    static int[] e = new int[300010];
    static int[] ne = new int[300010];
    static int[] w = new int[300010];
    static int[] dist = new int[100010];
    static boolean[] vis = new boolean[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Arrays.fill(h,-1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            insert(a,b,c);
            insert(b,a,c);
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            insert(0,x,0);
        }
        dijkstra();
        int q = sc.nextInt();
        while(q-- > 0){
            int t = sc.nextInt();
            System.out.println(dist[t]);
        }
    }

    private static void dijkstra() {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(s -> s[0]));
        queue.add(new int[]{0,0});
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        while (!queue.isEmpty()){
            int[] t = queue.poll();
            int u = t[1];
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            for (int i = h[u]; i != -1; i = ne[i]) {
                int j = e[i];
                if(dist[j] > dist[u] + w[i]){
                    dist[j] = dist[u] + w[i];
                    queue.add(new int[]{dist[j],j});
                }
            }
        }
    }

    private static void insert(int a, int b, int c) {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
