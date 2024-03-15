package LeetCode1002刷;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2024/3/14 9:36
 */
public class 分割回文串 {
    static List<List<String>> ans = new ArrayList<>();
    public static void main(String[] args) {
        String s = "aab";
        dfs(0,new ArrayList<String>(),s);
        System.out.println(ans);
    }

    private static void dfs(int u, ArrayList<String> list, String s) {
        if(u == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = u; i < s.length(); i++) {
            if(check(s,u,i)){
                list.add(s.substring(u,i+1));
                dfs(i+1,list,s);
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean check(String s, int st, int end) {
        while(st <= end){
            if(s.charAt(st++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
