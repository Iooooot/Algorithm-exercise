package LeetCode100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wht
 * @date 2023/6/28 10:32
 */
public class 找到字符串中所有字母异位词 {
    static int[] que = new int[100010];
    static Map<String,Integer> map = new HashMap<>();
    static boolean[] vis = new boolean[30005];
    static int tt,rr=-1;
    public static void main(String[] args) {
        String s = "abba";
        String p = "ab";

        dfs(0,new StringBuilder(),p);
        int n = s.length();
        int k = p.length();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(tt<=rr&&que[tt] < i - k + 1){
                tt++;
            }
            que[++rr] = i;
            if(i >= k - 1) {
                String s1 = s.substring(tt, rr+1);
                if(map.containsKey(s1)){
                    res.add(tt);
                }
            }
        }
        for (Integer re : res) {
            System.out.println(re);
        }
    }

    private static void dfs(int u, StringBuilder cur,String p) {
        if(u == p.length()){
            map.put(cur.toString(),1);
            return;
        }
        for (int i = 0; i < p.length(); i++) {
            if(!vis[i]){
                vis[i] = true;
                cur.append(p.charAt(i));
                dfs(u+1,cur,p);
                cur.delete(cur.length()-1, cur.length());
                vis[i] = false;
            }
        }

    }
}
