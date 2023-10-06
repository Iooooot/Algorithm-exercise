package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2023/10/5 10:08
 */
public class 电话号码的字母组合 {
    static String[] ch = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        String digits = "23";
        dfs(0,digits, new StringBuilder(""));
        for (String an : ans) {
            System.out.println(an);
        }
    }

    private static void dfs(int u, String digits,StringBuilder s) {
        if(u == digits.length()){
            ans.add(s.toString());
            return;
        }
        String t = ch[Integer.parseInt(String.valueOf(digits.charAt(u)))];
        for (int i = 0; i < t.length(); i++) {
            s.append(t.charAt(i));
            dfs(u+1,digits,s);
            s.delete(s.length()-1,s.length());
        }
    }
}
