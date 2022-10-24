package 贪心;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/23 8:50
 */
public class Main_排队打水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        Collections.sort(list);
        long res = 0;
        for (int i = 1; i < n; i++) {
            res += list.get(i - 1) * (n - i);
        }
        System.out.println(res);
    }
}
