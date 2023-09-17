package 剑指offer;

/**
 * @author wht
 * @date 2023/9/16 12:58
 */
public class 省份数量 {
    static boolean[] vis = new boolean[205];
    static int ans = 0;
    public static void main(String[] args) {
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                ans++;
                dfs(i,isConnected);
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int u, int[][] isConnected) {
        vis[u] = true;
        for (int i = 0; i < isConnected[u].length; i++) {
            if(!vis[i] && isConnected[u][i] == 1){
                dfs(i,isConnected);
            }
        }
    }

}
