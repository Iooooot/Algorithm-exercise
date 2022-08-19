package 搜索与图论;

import java.util.Scanner;

public class Main_走迷宫 {
    private static int[][] map = new int[105][105];
    private static int[][] d = new int[105][105];
    private static PII[] q = new PII[105*105];
    private static int hh,rr,n,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        q[rr++] = new PII(0,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = -1;
            }
        }
        d[0][0] = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(hh < rr){
            PII t = q[hh++];
            for (int i = 0; i < 4; i++) {
                int x = t.getFirst() + dx[i];
                int y = t.getSecond() + dy[i];
                if(x >= 0 && x < n && y >= 0 && y < m && map[x][y] == 0 && d[x][y] == -1){
                    q[rr++] = new PII(x,y);
                    d[x][y] = d[t.getFirst()][t.getSecond()] + 1;
                }
            }
        }
        return d[n - 1][m - 1];
    }

    private static class PII {
        private Integer first;

        private Integer second;

        public PII(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

        public PII() {
        }

        public Integer getFirst() {
            return first;
        }

        public Integer getSecond() {
            return second;
        }
    }
}
