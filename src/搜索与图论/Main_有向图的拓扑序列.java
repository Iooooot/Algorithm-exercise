package 搜索与图论;

import java.util.*;

public class Main_有向图的拓扑序列 {
    private static int n,m,idx;
    private static final int N = 100010;
    private static int[] h = new int[N];
    private static int[] entry = new int[N];
    private static int[] e = new int[N*2];
    private static int[] ne = new int[N*2];
    private static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            h[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            entry[b]++;
            insert(a,b);
        }
        bfs();
        if(ans.size() != n){
            System.out.println(-1);
        }else{
            for (Integer an : ans) {
                System.out.print(an + " ");
            }
        }
    }

    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if(entry[i] == 0){
                q.add(i);
            }
        }
        while(q.size() != 0){
            int t = q.remove();
            ans.add(t);
            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                if(entry[j] == 0){
                    continue;
                }
                entry[j]--;
                if(entry[j] == 0){
                    q.add(j);
                }
            }
        }
    }

    private static void insert(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
