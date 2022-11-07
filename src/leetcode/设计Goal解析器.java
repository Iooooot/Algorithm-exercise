package leetcode;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/11/6 9:45
 */
public class 设计Goal解析器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '('){
                if(sb.charAt(i+1) == ')'){
                    sb.replace(i,i+2, "o");
                }else{
                    sb.replace(i,i+4, "al");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
