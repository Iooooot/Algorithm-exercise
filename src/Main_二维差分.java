import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_二维差分 {
    static int[][] cf = new int[1010][1010];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int q = Integer.parseInt(s[2]);
        for (int i = 1; i <= n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                int num = Integer.parseInt(s1[j-1]);
                insert(i,j,i,j,num);
            }
        }
        while(q-- > 0){
            String[] s1 = br.readLine().split(" ");
            int x1 = Integer.parseInt(s1[0]);
            int y1 = Integer.parseInt(s1[1]);
            int x2 = Integer.parseInt(s1[2]);
            int y2 = Integer.parseInt(s1[3]);
            int num = Integer.parseInt(s1[4]);
            insert(x1,y1,x2,y2,num);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                cf[i][j] += cf[i-1][j] + cf[i][j-1] - cf[i-1][j-1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(cf[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void insert(int x1, int y1, int x2, int y2, int num) {
        cf[x1][y1] += num;
        cf[x2+1][y1] -= num;
        cf[x1][y2+1] -= num;
        cf[x2+1][y2+1] += num;
    }
}
