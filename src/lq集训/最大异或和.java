package lq集训;

import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/7 9:20
 */
public class 最大异或和 {
    static int idx = 0;
    static int[][] son = new int[3100010][2];
    static int[] s = new int[3100010];
    static int[] cnt = new int[3100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            s[i] = s[i-1] ^ t;
        }
        int res = 0;
        insert(s[0],1);
        for (int i = 1; i <= n; i++) {
            if(i - m - 1 >= 0){
                insert(s[i-m-1],-1);
            }
            res = Math.max(res,query(s[i]));
            insert(s[i],1);
        }
        System.out.println(res);
    }

    private static int query(int num) {
        int p = 0;
        int t = 0;
        for (int i = 30; i >= 0 ; i--) {
            int u = num >> i & 1;
            if(cnt[son[p][1-u]] != 0){
                t += (1 << i);
                p = son[p][1-u];
            }else{
                p = son[p][u];
            }
        }
        return t;
    }

    private static void insert(int num,int v) {
        int p = 0;
        for (int i = 30; i >= 0 ; i--) {
            int u = num >> i & 1;
            if(son[p][u] == 0){
                son[p][u] = ++idx;
            }
            p = son[p][u];
            cnt[p] += v;
        }
    }
}
