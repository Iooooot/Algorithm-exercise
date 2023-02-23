package leetcode;

import java.util.PriorityQueue;

/**
 * @author wht
 * @date 2023/2/22 10:19
 */
public class 最大平均通过率 {
    public static void main(String[] args) {
        int[][] classes = {{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        PriorityQueue<double[]> q = new PriorityQueue<>((s1,s2)-> {
            double a = (s1[0]+1) / (s1[1]+1) - s1[0]/s1[1];
            double b = (s2[0]+1) / (s2[1]+1) - s2[0]/s2[1];
            return Double.compare(b,a);
        });
        for (int i = 0; i < classes.length; i++) {
            q.offer(new double[]{classes[i][0],classes[i][1]});
        }
        for (int i = 0; i < extraStudents; i++) {
            double[] t = q.poll();

            q.offer(new double[]{t[0] + 1,t[1] + 1});
        }
        double ans = 0.0;
        for (double[] t : q) {
            ans += (t[0]/t[1]);
        }
        System.out.println(ans/classes.length);
    }
}
