package lq集训;

import java.io.*;


public class 亲戚 {
    public static int n;
    public static int m;
    public static int[] p = new int[20010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wt = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s1 = reader.readLine().split(" ");
        n = Integer.parseInt(s1[0]);
        m = Integer.parseInt(s1[1]);
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        for (int i = 0; i < m; i++) {
            String[] s2 = reader.readLine().split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            p[find(a)] = find(b);
        }
        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            String[] s3 = reader.readLine().split(" ");
            int c = Integer.parseInt(s3[0]);
            int d = Integer.parseInt(s3[1]);
            if(find(c) == find(d)){
                wt.println("Yes");
            }else{
                wt.println("No");
            }
        }
        wt.flush();
    }

    private static int find(int x) {
        if(p[x] != x){
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
