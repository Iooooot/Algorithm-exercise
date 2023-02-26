package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/2/25 10:20
 */
public class 改变数组元素 {
    public static int[] b = new int[200010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Arrays.fill(b,0, n+10,0);
            for (int j = 1; j <= n; j++) {
                int num = sc.nextInt();
                num = Math.min(num,j);
                int l = j - num + 1;
                int r = j;
                b[l] += 1;
                b[r+1] -= 1;
            }
            for (int j = 1; j <= n; j++) {
                b[j] += b[j-1];
            }
            for (int j = 1; j <= n; j++) {
                if(b[j] == 0){
                    System.out.println(0 + " ");
                }else{
                    System.out.println(1 +" ");
                }
            }
            System.out.println();
        }


    }
}
