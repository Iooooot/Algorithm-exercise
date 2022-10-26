package 贪心;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/25 8:48
 */
public class Main_耍杂技的牛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Cow> cows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cows.add(new Cow(a,b));
        }
        Collections.sort(cows, Comparator.comparingInt(c -> (c.s + c.w)));
        int sum = 0,res = (int)-2e9;
        for (int i = 0; i < n; i++) {
            res = Math.max(res,sum - cows.get(i).s);
            sum += cows.get(i).w;
        }
        System.out.println(res);
    }
    static class Cow{
        int w;
        int s;

        public Cow(int w, int s) {
            this.w = w;
            this.s = s;
        }

        public Cow() {

        }
    }
}
