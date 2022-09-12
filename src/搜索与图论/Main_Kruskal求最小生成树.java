package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Kruskal求最小生成树 {
    private static final int INF = (int)1e9;
    private static int n,m;
    private static List<Edge> edgeList = new ArrayList<>();
    private static int[] p = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 0; i < m; i++) {
            String[] s1 = reader.readLine().split(" ");
            int x = Integer.parseInt(s1[0]);
            int y = Integer.parseInt(s1[1]);
            int z = Integer.parseInt(s1[2]);
            edgeList.add(new Edge(x,y,z));
        }
        Collections.sort(edgeList,(e1,e2) -> e1.w - e2.w);

        int t = kruskal();
        if(t == INF){
            System.out.println("impossible");
        }else{
            System.out.println(t);
        }
    }

    private static int kruskal() {
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        int res = 0,cnt = 0;
        for (int i = 0; i < m; i++) {
            Edge edge = edgeList.get(i);
            int a = edge.a;
            int b = edge.b;
            int w = edge.w;
            a = find(a);
            b = find(b);
            if(a != b){
                //没有在一个集合中进行合并
                p[a] = b;
                res += w;
                //记录边数
                cnt++;
            }
        }
        if(cnt < n - 1){
            return INF;
        }
        return res;
    }

    private static int find(int x) {
        if(p[x] != x){
            p[x] = find(p[x]);
        }
        return p[x];
    }

    private static class Edge {
        int a;
        int b;
        int w;

        public Edge() {
        }

        public Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }
}
