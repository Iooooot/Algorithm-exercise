package LeetCode100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wht
 * @date 2023/4/21 9:31
 */
public class 括号生成 {
    static List<String> ans = new ArrayList<>();
    static char[] ch = {'(',')'};
    public static void main(String[] args) {
        int n = 1;
        dfs(n,0,new StringBuilder());
        for (String an : ans) {
            System.out.println(an);
        }
    }

    private static void dfs(int n, int u, StringBuilder sb) {
        if(u == 2*n){
            if(check(sb.toString())){
                ans.add(sb.toString());
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            sb.append(ch[1-i]);
            dfs(n,u+1,sb);
            sb.deleteCharAt(u);
        }
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character t = stack.pop();
                if(t != '('){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
