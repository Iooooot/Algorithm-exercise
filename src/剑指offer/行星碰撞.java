package 剑指offer;

import java.util.LinkedList;

/**
 * @author wht
 * @date 2023/9/1 10:00
 */
public class 行星碰撞 {
    public static void main(String[] args) {
        int[] asteroids = {-2,-1,1,2};
        int len = asteroids.length;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            boolean alive = true;
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            }else{
                while(alive && !stack.isEmpty() && stack.peek() > 0){
                    if(stack.peek() > Math.abs(asteroids[i])){
                        alive = false;
                        break;
                    }else if(stack.peek() == Math.abs(asteroids[i])){
                        alive = false;
                        stack.pop();
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if(alive){
                    stack.push(asteroids[i]);
                }
            }
        }
        int cnt = 0;
        int[] res = new int[stack.size()];
        for (int i = stack.size() -1; i >=  0; i--) {
            res[cnt++] = stack.get(i);
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(res[i]);
        }
    }
}
