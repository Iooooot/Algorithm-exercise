package leetcode;

import java.util.HashMap;
import java.util.List;

/**
 * @author wht
 * @date 2023/1/12 10:11
 */
public class 替换字符串中的括号内容 {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        String[][] str = {{"name","bob"},{"age","two"}};
        List<List<String>> knowledge;

        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        // for (List<String> list : knowledge) {
        //     map.put(list.get(0),list.get(1));
        // }
        for (String[] strings : str) {
            map.put(strings[0],strings[1]);
        }
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            if(s.charAt(i) == '('){
                while(j < s.length() && s.charAt(j) != ')') {
                    j++;
                }
            }
            if(j != i){
                sb.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i = j;
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
