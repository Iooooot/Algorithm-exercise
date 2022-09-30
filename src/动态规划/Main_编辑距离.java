package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/28 11:05
 */
public class Main_编辑距离 {
    private static int n,m;
    private static String[] s = new String[1010];
    private static int[][] f = new int[1010][11];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = " " + sc.next();
        }
        for (int i = 0; i < m; i++) {
            int res = 0;
            String b = " " + sc.next();
            int limit = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if(get_distance(s[j],b) <= limit){
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    private static int get_distance(String a,String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        for (int i = 0; i < lenA; i++) {
            Arrays.fill(f[i],0);
        }
        for (int i = 0; i <= lenA; i++) {
            f[i][0] = i;
        }
        for (int i = 0; i <= lenB; i++) {
            f[0][i] = i;
        }

        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                f[i][j] = Math.min(f[i-1][j] + 1,f[i][j-1] + 1);
                if(a.charAt(i) == b.charAt(j)){
                    f[i][j] = Math.min(f[i][j],f[i-1][j-1]);
                }else{
                    f[i][j] = Math.min(f[i][j],f[i-1][j-1] + 1);
                }
            }
        }
        return f[lenA][lenB];
    }
}
