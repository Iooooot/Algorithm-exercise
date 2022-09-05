package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_bellmanFord求最短路 {
    private static int n,m,k;
    private static int[] dist = new int[510];
    private static int[] backup = new int[510];
    private static List<Edge> edges = new ArrayList<>();;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        k = Integer.parseInt(s[2]);
        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            edges.add(new Edge(x,y,z));
        }
        bellman_Ford();

        if(dist[n] > Integer.MAX_VALUE / 2){
            System.out.println("impossible");
        }else{
            System.out.println(dist[n]);
        }
    }

    private static void bellman_Ford() {
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1] = 0;
        for (int i = 0; i < k; i++) {
            backup = Arrays.copyOf(dist,n+1);

            for (int j = 0; j < edges.size(); j++) {
                Edge edge = edges.get(j);
                int a = edge.getA();
                int b = edge.getB();
                int c = edge.getW();
                if(backup[a] != Integer.MAX_VALUE){
                    dist[b] = Math.min(dist[b],backup[a] + c);
                }
            }
        }
    }

    static class Edge{
        private int a;
        private int b;
        private int w;

        public Edge() {
        }

        public Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getW() {
            return w;
        }
    }
}
