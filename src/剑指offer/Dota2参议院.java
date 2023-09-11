package 剑指offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wht
 * @date 2023/9/3 10:19
 */
public class Dota2参议院 {
    public static void main(String[] args) {
        String senate = "RDD";

        Deque<Integer> r = new ArrayDeque<>();
        Deque<Integer> d = new ArrayDeque<>();
        int len = senate.length();
        for (int i = 0; i < len; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                r.offer(i);
            } else {
                d.offer(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()) {
            Integer ri = r.poll();
            Integer pi = d.poll();
            if (ri < pi) {
                r.offer(len + ri);
            } else {
                d.offer(len + pi);
            }
        }
        if (!r.isEmpty()) {
            System.out.println("Radiant");
        } else {
            System.out.println("Dire");
        }
    }
}


