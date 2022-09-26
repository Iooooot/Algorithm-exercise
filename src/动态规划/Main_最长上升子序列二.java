package 动态规划;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/9/23 12:14
 */
public class Main_最长上升子序列二 {
    private static int[] num = new int[100010];
    private static int[] q = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int len = 0;
        for (int i = 0; i < n; i++) {
            int l = 0, r = len;
            while(l < r){
                int mid = l + r + 1 >> 1;
                if(q[mid] < num[i]){
                    l = mid;
                }else{
                    r = mid - 1;
                }
            }
            len = Math.max(len,r + 1);
            q[r + 1] = num[i];
        }
        System.out.println(len);
    }
}
