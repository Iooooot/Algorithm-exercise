package 剑指offer;

import java.util.LinkedList;

/**
 * @author wht
 * @date 2023/10/19 10:17
 */
public class 每日温度 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int len = temperatures.length;
        int[] ans = new int[len];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = len-1; i >= 0; i--) {
            while(stack.size() != 0 && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.size() == 0){
                ans[i] = 0;
            }else{
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
