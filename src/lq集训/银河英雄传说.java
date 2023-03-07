package lq集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2023/3/4 11:06
 */
public class 银河英雄传说 {
    static int[] p = new int[30010];
    static int[] d = new int[30010];
    static int[] sz = new int[30010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i <= 30000; i++) {
            p[i] = i;
            sz[i] = 1;
        }
        for (int i = 0; i < t; i++) {
            String[] s = reader.readLine().split(" ");
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            if("M".equals(s[0])){
                int pa = find(a), pb = find(b);
                if (pa != pb)
                {
                    d[pa] = sz[pb];
                    sz[pb] += sz[pa];
                    p[pa] = pb;
                }
            }else{
                if(find(a) == find(b)){
                    System.out.println(Math.max(Math.abs(d[a]-d[b]- 1),0));
                }else{
                    System.out.println(-1);
                }
            }
        }
    }

    private static int find(int x) {
        if(p[x] != x){
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x] = t;
        }
        return p[x];
    }
}
