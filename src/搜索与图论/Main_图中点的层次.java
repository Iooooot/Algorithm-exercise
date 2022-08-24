package 搜索与图论;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_图中点的层次 {
    private static int n,m,idx;
    private static int[] h = new int[100010];
    private static int[] e = new int[200010];
    private static int[] ne = new int[200010];
    private static int[] dis = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            dis[i] = -1;
            h[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            insert(a,b);
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        dis[1] = 0;
        while (q.size() != 0) {
            int t = q.remove();
            for (int i = h[t]; i != -1 ; i = ne[i]) {
                int j = e[i];
                if(dis[j] != -1){
                    continue;
                }
                q.add(j);
                dis[j] = dis[t] + 1;
            }
        }
        return dis[n];
    }

    private static void insert(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
