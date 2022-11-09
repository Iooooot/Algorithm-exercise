package leetcode;

import java.util.HashMap;

/**
 * @author wht
 * @date 2022/11/8 8:36
 */
public class 统计一致字符串的数目 {
    public static void main(String[] args) {
        String allowed = "ab";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i),1);
        }
        int res = 0;
        String[] words = {"ad","bd","aaab","baa","badab"};
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if(!map.containsKey(word.charAt(i))){
                    flag = false;
                }
            }
            if(flag){
                res++;
            }
        }
    }
}
