package leetcode150;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wht
 * @date 2023/11/29 9:16
 */
public class 单词规律 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        String[] s1 = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(s1.length != pattern.length()){
            System.out.println(false);
            return;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i)) && !set.contains(s1[i])){
                map.put(pattern.charAt(i), s1[i]);
                set.add(s1[i]);
            }else{
                if(!s1[i].equals(map.get(pattern.charAt(i)))){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
