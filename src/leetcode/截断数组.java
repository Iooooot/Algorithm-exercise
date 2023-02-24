package leetcode;

import java.util.Scanner;

/**
 * @author wht
 * @date 2023/2/23 11:13
 */
public class 截断数组 {
    public static int[] s = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            s[i] = s[i-1] + t;
        }
        if(s[n] % 3 != 0){
            System.out.println(-1);
        }else{
            long ans = 0;
            int cnt = 0;
            for (int i = 2; i < n; i++) {
                if(s[i-1] == s[n] / 3){
                    cnt++;
                }
                if(s[i] == 2*(s[n]/3)){
                    ans += cnt;
                }
            }
            System.out.println(ans);
        }
    }
}
