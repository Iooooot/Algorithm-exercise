package 数论;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/31 8:44
 */
public class Main_约数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
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
            if(x > 1){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        long res = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer a = entry.getKey();
            Integer b = entry.getValue();
            long t = 1;
            while(b-- != 0){
                t = (t * a + 1)% (int)(1e9+7) ;
            }
            res = res * t % (int)(1e9+7);
        }
        System.out.println(res);
    }
}
