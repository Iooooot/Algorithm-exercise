package 动态规划;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/9 13:27
 */
public class Main_蒙德里安的梦想 {
    public static boolean[] vis = new boolean[1<<12];
    public static long[][] f = new long[15][1<<12];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0){ // 如果n跟m同时为0结束循环
                break;
            }
            for (int i = 0; i < 1<<n; i++) {
                int cnt = 0;
                vis[i] = true;
                for (int j = 0; j < n; j++) {
                    if((i >> j & 1) == 1){
                        if((cnt & 1) == 1){
                            // 有奇数个0
                            vis[i] = false;
                            cnt = 0;
                        }
                    }else{
                        cnt++;
                    }
                }
                if((cnt & 1) == 1){
                    vis[i] = false;
                }
            }
            for (int i = 0; i < 15; i++) {
                Arrays.fill(f[i],0);
            }
            f[0][0] = 1;

            for (int i = 1; i <= m; i ++ ){
                for (int j = 0; j < 1 << n; j ++ ){
                    for (int k = 0; k < 1 << n; k ++ ){
                        if ((j & k) == 0 && vis[j | k]){
                            f[i][j] += f[i - 1][k];
                        }
                    }
                }
            }
            System.out.println(f[m][0]);
        }
    }
}
