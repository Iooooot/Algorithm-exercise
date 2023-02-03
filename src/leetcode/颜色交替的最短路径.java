package leetcode;

import java.util.*;

/**
 * @author wht
 * @date 2023/2/2 10:28
 */
public class 颜色交替的最短路径 {
    public static void main(String[] args) {
        int n = 3;
        int[][] redEdges = {{0,1}};
        int[][] blueEdges = {{1,2}};
        List<Integer>[][] g = new List[2][n];
        for (List<Integer>[] f : g) {
            Arrays.setAll(f, k -> new ArrayList<>());
        }
        for (int[] redEdge : redEdges) {
            g[0][redEdge[0]].add(redEdge[1]);
        }
        for (int[] blueEdge : blueEdges) {
            g[1][blueEdge[0]].add(blueEdge[1]);
        }
        Deque<int[]> q = new ArrayDeque<>();
        // 第一步红蓝都可以走
        q.offer(new int[]{0,0});
        q.offer(new int[]{0,1});
        boolean[][] vis = new boolean[n][2];
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        int d = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] t = q.poll();
                int j = t[0],c = t[1];
                if(ans[j] == -1){
                    ans[j] = d;
                }
                vis[j][c] = true;
                c ^= 1;
                for (Integer k : g[c][j]) {
                    if(!vis[k][c]){
                        q.add(new int[]{k,c});
                    }
                }
            }
            d++;
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
