package 剑指offer;

import java.util.ArrayList;

/**
 * @author wht
 * @date 2023/8/6 10:27
 */
public class 反转字符串中的元音字母 {
    public static void main(String[] args) {
        String s = "race car";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                list.add(c);
            }
        }
        for (int i = 0; i < list.size() / 2; i++) {
            Character t = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,t);
        }
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                sb.replace(i, i+1,"" + list.get(cnt%list.size()));
                cnt++;
            }
        }
        System.out.println(sb.toString());
    }
}
