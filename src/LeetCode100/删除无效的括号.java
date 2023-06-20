package LeetCode100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wht
 * @date 2023/6/19 9:59
 */
public class 删除无效的括号 {
    public static void main(String[] args) {
        String s = "()())()";
        List<String> ans = new ArrayList<String>();
        Set<String> currSet = new HashSet<String>();

        currSet.add(s);
        while(true){
            for (String s1 : currSet) {
                if(isValid(s1)){
                    ans.add(s1);
                }
            }
            if(ans.size() > 0){
                break;
            }
            Set<String> nextSet = new HashSet<String>();
            for (String s1 : currSet) {
                for (int i = 0; i < s1.length(); i++) {
                    if(i > 0 && s1.charAt(i) == s1.charAt(i-1)){
                        continue;
                    }
                    if(s1.charAt(i) == '(' || s1.charAt(i) == ')'){
                        nextSet.add(s1.substring(0, i) + s1.substring(i + 1));
                    }
                }
            }
            currSet = nextSet;
        }
    }
    private static boolean isValid(String str) {
        char[] ss = str.toCharArray();
        int count = 0;

        for (char c : ss) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}
