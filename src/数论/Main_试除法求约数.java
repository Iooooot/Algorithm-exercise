package 数论;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/29 9:28
 */
public class Main_试除法求约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            for (int j = 1; j <= x/j ; j++) {
                if(x % j == 0){
                    ans.add(j);
                    if(j != x/j){
                        ans.add(x/j);
                    }
                }
            }
            Collections.sort(ans);
            for (Integer an : ans) {
                System.out.print(an+" ");
            }
            System.out.println();
        }
    }
}
