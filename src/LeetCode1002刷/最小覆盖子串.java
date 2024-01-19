package LeetCode1002刷;

import java.util.*;

/**
 * @author wht
 * @date 2024/1/18 10:34
 */
public class 最小覆盖子串 {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaabbbbbcdd";
        String t = "abcdd";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int l = 0,r = 0,count = 0;
        int len = Integer.MAX_VALUE,st = 0;
        while(r < s.length()){
            char c1 = s.charAt(r);
            r++;
            if(map.containsKey(c1)){
                cnt.put(c1,cnt.getOrDefault(c1,0)+1);
                if(cnt.get(c1).equals(map.get(c1))){
                    count++;
                }
            }
            while(count == map.size()){
                if(r - l < len){
                    len = r - l;
                    st = l;
                }
                char c2 = s.charAt(l);
                l++;
                if(map.containsKey(c2)){
                    if(map.get(c2).equals(cnt.get(c2))){
                        count--;
                    }
                    cnt.put(c2,cnt.get(c2)-1);
                }
            }
        }
        String ans = len == Integer.MAX_VALUE ? "" : s.substring(st,st+len);
        System.out.println(ans);
    }


}
