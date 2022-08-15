package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_字符串哈希 {
    static final int P = 131;
    private static long[] h = new long[100010];
    private static long[] p = new long[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String str = reader.readLine();
        p[0] = 1;
        for (int i = 1; i <= n; i++) {
            p[i] = p[i - 1] * P;
            h[i] = h[i - 1] * P + str.charAt(i-1);
        }
        for (int i = 0; i < m; i++) {
            String[] s1 = reader.readLine().split(" ");
            int l1 = Integer.parseInt(s1[0]);
            int r1 = Integer.parseInt(s1[1]);
            int l2 = Integer.parseInt(s1[2]);
            int r2 = Integer.parseInt(s1[3]);
            if(find(l1,r1) == find(l2,r2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static long find(int l, int r) {
        return h[r] - h[l - 1] * p[r - l + 1];
    }
}
