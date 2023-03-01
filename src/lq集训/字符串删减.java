package lq集训;

import java.util.Scanner;


public class 字符串删减 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'x'){
                int j = i + 1;
                while(j < n && s.charAt(j) == 'x') {
                    j++;
                }
                ans += Math.max(0,j - i - 2);
                i = j - 1;
            }
        }
        System.out.println(ans);
    }
}
