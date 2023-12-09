package leetcode150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wht
 * @date 2023/11/18 10:20
 */
public class 串联所有单词的子串 {
    static boolean[] vis = new boolean[5005];
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        String s = "ccdcbadacbaacddddbdaccbabdaabbcdabcbbbbacbaabdaaadacbbcdacdbabbacd";
        String[] words = {"bdac","dddd"};
        dfs(0,words,s,"");
        for (Integer an : ans) {
            System.out.println(an);
        }
    }

    private static void dfs(int u, String[] words, String s, String str) {
        if(u == words.length){
            int t = s.indexOf(str);
            while (t != -1) {
                if(!ans.contains(t)){
                    ans.add(t);
                }
                t = s.indexOf(str, t + 1);
            }
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if(!vis[i]){
                vis[i] = true;
                dfs(u+1,words,s,str + words[i]);
                vis[i] = false;
            }
        }
    }
}
