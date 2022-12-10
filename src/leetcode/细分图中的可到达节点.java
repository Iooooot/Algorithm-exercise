package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2022/11/26 11:19
 */
public class 细分图中的可到达节点 {
    public static int idx;
    public static int dist[] = new int[3005];
    public static int h[] = new int[3005];
    public static int e[] = new int[3005];
    public static int w[] = new int[3005];
    public static int ne[] = new int[3005];
    public static boolean vis[] = new boolean[3005];

    public static void main(String[] args) {
        int[][] edges = {{0,1,4},{1,2,6},{0,2,8},{1,3,1}};
        System.out.println(reachableNodes(edges,10,4));
    }

    public static int reachableNodes(int[][] edges, int maxMoves, int n) {
        Arrays.fill(h,-1);
        int ans = 0;
        for (int[] edge : edges) {
            add(edge[0],edge[1],edge[2]+1);
            add(edge[1],edge[0],edge[2]+1);
        }
        dijkstra();
        for (int i = 0; i < n; i++) {
            if(dist[i] <= maxMoves){
                ans++;
            }
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1], cnt = e[2];
            int a = Math.min(cnt, Math.max(0, maxMoves - dist[u]));
            int b = Math.min(cnt, Math.max(0, maxMoves - dist[v]));
            ans += Math.min(cnt, a + b);
        }
        return ans;
    }

    private static void add(int a, int b, int c) {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void dijkstra(){
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<PII> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.second));
        queue.add(new PII(0,0));
        while(!queue.isEmpty()){
            PII t = queue.poll();
            int v = t.first;
            int d = t.second;
            if(vis[v]){
                continue;
            }
            vis[v] = true;
            for (int i = h[v]; i != -1 ; i = ne[i]) {
                int j = e[i];
                if(dist[j] > d + w[i]){
                    dist[j] = d + w[i];
                    queue.add(new PII(j,dist[j]));
                }
            }
        }
    }

    private static class PII {
        private int first;

        private int second;

        public PII() {
        }

        public PII(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
