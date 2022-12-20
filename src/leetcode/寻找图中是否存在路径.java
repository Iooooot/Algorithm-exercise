package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2022/12/19 17:36
 */
public class 寻找图中是否存在路径 {
    public static int[] h = new int[200010];
    public static int[] e = new int[400010];
    public static int[] ne = new int[400010];
    public static boolean[] vis = new boolean[200010];
    public static int idx;
    public static void main(String[] args) {
        int[][] edges = {{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}};
        int source = 7;
        int destination = 5;
        Arrays.fill(h,-1);
        for (int[] edge : edges) {
            add(edge[0],edge[1]);
            add(edge[1],edge[0]);
        }
        System.out.println(dfs(source,destination));
    }

    private static boolean dfs(int u,int end) {
        if(u == end){
            return true;
        }
        vis[u] = true;
        for (int i = h[u]; i != -1 ; i = ne[i]) {
            int j = e[i];
            if(!vis[j] && dfs(j,end)){
                return true;
            }
        }
        return false;
    }

    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
