package lq真题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wht
 * @date 2023/11/6 10:21
 */
public class 罗马数字转整数 {
    public static void main(String[] args) {
        String s = "III";
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;
        int preNum = map.get(s.charAt(0)+"");
        for(int i = 1;i < s.length(); i ++) {
            int num = map.get(s.charAt(i)+"");
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        System.out.println(sum);
    }
}
