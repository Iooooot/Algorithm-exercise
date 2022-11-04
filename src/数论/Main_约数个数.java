package 数论;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/30 9:23
 */
public class Main_约数个数 {
    private static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 2; j <= x/j; j++) {
                if(x % j == 0){
                    while(x % j == 0){
                        x /= j;
                        map.put(j,map.getOrDefault(j,0)+1);
                    }
                }
            }
            if(x>1){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        long res = 1;
        for (Integer value : map.values()) {
            res = res * (value + 1) % MOD;
        }
        System.out.println(res);
    }
}
