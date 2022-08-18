package 搜索与图论;

import java.util.Scanner;

public class Main_n皇后问题 {
    private static int n;
    private static char[][] m = new char[20][20];
    private static boolean[] col = new boolean[20];
    private static boolean[] dg = new boolean[20];
    private static boolean[] rdg = new boolean[20];
    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = '.';
            }
        }
        dfs(0);
    }

    private static void dfs(int u) {
        if(u == n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if(!col[i] && !dg[u + i] && !rdg[u - i + n]){
                col[i] = true;
                dg[u + i] = true;
                rdg[u - i + n] = true;
                m[u][i] = 'Q';
                dfs(u+1);
                m[u][i] = '.';
                col[i] = false;
                dg[u + i] = false;
                rdg[u - i + n] = false;
            }
        }
    }
}
