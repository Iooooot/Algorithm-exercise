package 剑指offer;

import java.util.LinkedList;

/**
 * @author wht
 * @date 2023/8/31 14:42
 */
public class 从字符串中移除星号 {
    public static void main(String[] args) {
        // String s = "leet**cod*e";
        // StringBuilder sb = new StringBuilder(s);
        // for (int i = 0; i < sb.length(); i++) {
        //     if(sb.charAt(i) == '*'){
        //         if(i == 0){
        //             sb.delete(0,1);
        //             i--;
        //         }else{
        //             sb.delete(i-1,i+1);
        //             i-=2;
        //         }
        //     }
        // }
        // System.out.println(sb.toString());
        System.out.println(fun2());
    }

    private static String fun2() {
        String s = "leet**cod*e";
        LinkedList<Character> stack = new LinkedList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
