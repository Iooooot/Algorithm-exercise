package LeetCode1002刷;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author wht
 * @date 2024/1/15 10:01
 */
public class 找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        int[] cnt = new int[27];
        for (int i = 0; i < p.length(); i++) {
            cnt[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            queue.offer(i);
            cnt[s.charAt(i)-'a']--;
            while(cnt[s.charAt(i) - 'a'] < 0 && !queue.isEmpty()){
                Integer t = queue.poll();
                cnt[s.charAt(t)-'a']++;
            }
            if(check(cnt)){
                ans.add(queue.peek());
            }
        }
    }

    private static boolean check(int[] cnt) {
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] != 0){
                return false;
            }
        }
        return true;
    }
}
