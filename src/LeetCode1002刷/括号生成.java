package LeetCode1002刷;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author wht
 * @date 2024/3/12 9:39
 */
public class 括号生成 {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        dfs(0,new StringBuilder(),n);
        for (String an : ans) {
            System.out.println(an);
        }
    }

    private static void dfs(int u, StringBuilder sb, int n) {
        if(u == n*2){
            if(check(sb.toString())){
                ans.add(sb.toString());
            }
            return;
        }
        sb.append('(');
        dfs(u+1,sb,n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        dfs(u+1,sb,n);
        sb.deleteCharAt(sb.length()-1);
    }

    private static boolean check(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
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
