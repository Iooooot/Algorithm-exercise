package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_合并集合 {
    //记录父节点
    static int[] p = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        for (int i = 1; i <= n; i++) {
            //树根父节点指向自己
            p[i] = i;
        }
        int m = Integer.parseInt(s[1]);
        for (int i = 0; i < m; i++) {
            String[] str = reader.readLine().split(" ");
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            if(("M").equals(str[0])){
                //合并
                p[find(a)] = find(b);
            }else{
                if(find(a) == find(b)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }

    private static int find(int x) {
        if(p[x] != x){
            //将所有路径的父节点都指向根节点
            p[x] = find(p[x]);
        }

        return p[x];
    }
}
