package leetcode;

/**
 * @author wht
 * @date 2022/12/3 12:06
 */
public class 字符串中第二大的数字 {
    public static void main(String[] args) {
        String s = "ck077";
        int a = -1,b = -1;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                int t = s.charAt(i) - '0';
                if(t > a){
                    b = a;
                    a = t;
                }else if(t > b && t < a){
                    b = t;
                }
            }
        }
        System.out.println(b);
    }
}
