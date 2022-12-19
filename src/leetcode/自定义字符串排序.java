package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wht
 * @date 2022/11/13 13:26
 */
public class 自定义字符串排序 {
    public static int[] a = new int[27];
    public static void main(String[] args) {
        String order = "exv";
        String s = "xwvee";
        String[] ch = s.split("");
        for (int i = 0; i < order.length(); i++) {
            a[order.charAt(i) - 'a'] = i + 1;
        }
        int len = s.length();
        for (int i = 0,j = 0; i < len; i++) {
            while(j < len && a[s.charAt(j) - 'a'] != 0){
                j++;
            }
            if(a[s.charAt(j) - 'a'] != 0){
                Arrays.sort(ch,i,j,Comparator.comparingInt(s1 -> a[s1.charAt(0) - 'a']));
                i = j + 1;
            }else{
                i = j;
            }
        }

        System.out.println(String.join("",ch));
    }
}
