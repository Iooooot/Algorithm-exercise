package LeetCode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2023/4/18 10:01
 */
public class 电话号码的字母组合 {
    static String[] zm = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static boolean[] vis = new boolean[10];
    static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        String digits = "22";
        if(digits.length() != 0){
            dfs(digits,0,new StringBuilder());
        }
        for (String an : ans) {
            System.out.print(an + "  ");
        }
    }

    private static void dfs(String digits, int cnt,StringBuilder s) {
        if(cnt == digits.length()){
            ans.add(s.toString());
            return;
        }
        int idx = Integer.parseInt(String.valueOf(digits.charAt(cnt)));
        String t = zm[idx];
        for (int i = 0; i < t.length(); i++) {
            s.append(t.charAt(i));
            dfs(digits,cnt+1,s);
            s.deleteCharAt(cnt);
        }
    }
}
