package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main_Dijkstra求最短路径02 {
    private static final int N = 150010;
    private static int n,m,idx;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    private static int[] w = new int[N];
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
        System.out.println(dijkstra());
    }

    private static int dijkstra() {
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1] = 0;
        //创建优先队列,并且根据距离来升序排序
        PriorityQueue<PII> priorityQueue = new PriorityQueue<>((a, b) -> a.second - b.second);
        priorityQueue.offer(new PII(1,0));
        while(priorityQueue.size() != 0){
            PII t = priorityQueue.poll();
            int ver = t.first;
            int distance = t.second;
            if(vis[ver]){
                continue;
            }
            vis[ver] = true;
            for (int i = h[ver]; i != -1 ; i = ne[i]) {
                int j = e[i];
                if(dist[j] > distance + w[i]){
                    dist[j] = distance + w[i];
                    priorityQueue.offer(new PII(j,dist[j]));
                }
            }
        }

        if(dist[n] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[n];
    }

    private static void add(int x, int y, int z) {
        e[idx] = y;
        w[idx] = z;
        ne[idx] = h[x];
        h[x] = idx++;
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
