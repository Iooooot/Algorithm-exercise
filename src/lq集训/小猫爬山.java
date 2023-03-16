package lq集训;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/11 10:52
 */
public class 小猫爬山 {
    static Integer[] ws = new Integer[20];
    static Integer[] sum = new Integer[20];
    static int n,w,res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ws[i] = sc.nextInt();
        }
        Arrays.sort(ws,0,n, Comparator.reverseOrder());
        dfs(0,0);
        System.out.println(res);
    }

    private static void dfs(int u,int cnt) {
        if(cnt >= res){
            return;
        }
        if(u == n){
            res = cnt;
            return;
        }
        for (int i = 0; i < cnt; i++) {
            if(sum[i] + ws[u] <= w){
                sum[i] += ws[u];
                dfs(u+1,cnt);
                sum[i] -= ws[u];
            }
        }
        sum[cnt] = ws[u];
        dfs(u+1,cnt+1);
        sum[cnt] -= ws[u];
    }
}
