import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_二维前缀和 {
    static int[][] arr = new int[1010][1010];
    static int[][] sum = new int[1010][1010];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int q = Integer.parseInt(s[2]);
        for (int i = 1; i <= n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(s1[j-1]);
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
            }
        }
        while(q-- > 0){
            String[] s1 = br.readLine().split(" ");
            int x1 = Integer.parseInt(s1[0]);
            int y1 = Integer.parseInt(s1[1]);
            int x2 = Integer.parseInt(s1[2]);
            int y2 = Integer.parseInt(s1[3]);
            int ans = sum[x2][y2] - sum[x2][y1-1] - sum[x1-1][y2] + sum[x1-1][y1-1];
            System.out.println(ans);
        }
    }
}
