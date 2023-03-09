package lq集训;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/8 10:00
 */
public class 微博转发 {
    static int[] h = new int[1010];
    static int[] e = new int[100010];
    static int[] ne = new int[100010];
    static boolean[] vis = new boolean[1010];
    static int idx,n,l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        Arrays.fill(h,-1);
        for (int i = 1; i <= n; i++) {
            int cnt = sc.nextInt();
            while(cnt-- > 0){
                int x = sc.nextInt();
                add(x,i);
            }
        }
        int m = sc.nextInt();
        while(m-- > 0){
            int x = sc.nextInt();
            System.out.println(bfs(x));
        }
    }

    private static int bfs(int x) {
        Arrays.fill(vis,false);
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(x);
        vis[x] = true;
        int res = 0;
        for (int i = 0; i < l; i++) {
            int sz = queue.size();
            while(sz-- > 0){
                Integer t = queue.poll();
                for (int j = h[t]; j != -1; j = ne[j]) {
                    int a = e[j];
                    if(!vis[a]){
                        queue.offer(a);
                        vis[a] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
