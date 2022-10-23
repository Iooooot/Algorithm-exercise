package 贪心;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/20 9:16
 */
public class Main_合并果子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            priorityQueue.add(t);
        }
        int sum = 0;
        if(priorityQueue.size() == 1){
            priorityQueue.poll();
            sum = 0;
        }
        while(!priorityQueue.isEmpty()){
            Integer a = priorityQueue.poll();
            Integer b = priorityQueue.poll();
            int t = a + b;
            sum += t;
            if(!priorityQueue.isEmpty()){
                priorityQueue.add(t);
            }
        }
        System.out.println(sum);
    }
}
