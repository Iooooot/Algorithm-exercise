package LeetCode100;

import java.util.Stack;

/**
 * @author wht
 * @date 2023/6/24 9:11
 */
public class 字符串解码 {
    public static void main(String[] args) {
        String s = "100[leetcode]";
        Stack<Integer> nums = new Stack<>();
        Stack<String> strs = new Stack<>();
        StringBuilder res = new StringBuilder();
        int multi = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                multi = multi*10 + Integer.parseInt(ch+"");
            } else if(ch == '['){
                nums.push(multi);
                strs.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if(ch == ']'){
                StringBuilder tmp = new StringBuilder();
                Integer t = nums.pop();
                for (int j = 0; j < t; j++) {
                    tmp.append(res);
                }
                res = new StringBuilder(strs.pop() + tmp);
            } else {
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
}
