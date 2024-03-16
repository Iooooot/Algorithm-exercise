package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/3/15 9:41
 */
public class N皇后问题 {
    static List<List<String>> ans = new ArrayList<>();
    static boolean[] rdg = new boolean[20];
    static boolean[] col = new boolean[20];
    static boolean[] dg = new boolean[20];
    static char[][] m;
    public static void main(String[] args) {
        int n = 4;
        m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = '.';
            }
        }
        dfs(0,n);
        System.out.println(ans);
    }

    private static void dfs(int u, int n) {
        if(u == n){
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(String.valueOf(m));
            }
            ans.add(temp);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!col[i] && !dg[u + i] && !rdg[u - i + n]){
                col[i] = true;
                dg[u + i] = true;
                rdg[u - i + n] = true;
                m[u][i] = 'Q';
                dfs(u+1,n);
                m[u][i] = '.';
                col[i] = false;
                dg[u + i] = false;
                rdg[u - i + n] = false;
            }
        }
    }
}
