package LeetCode100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wht
 * @date 2023/6/7 12:58
 */
public class 课程表 {
    private static int n,m,idx,cnt;
    private static final int N = 100010;
    private static int[] h = new int[N];
    private static int[] entry = new int[N];
    private static int[] e = new int[N*2];
    private static int[] ne = new int[N*2];
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        n = numCourses;
        m = prerequisites.length;
        for (int i = 0; i <= n; i++) {
            h[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            entry[b]++;
            insert(a,b);
        }
        bfs();
        if(cnt != n){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(entry[i] == 0){
                q.add(i);
            }
        }
        while(q.size() != 0){
            int t = q.remove();
            cnt++;
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
