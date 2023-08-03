package 剑指offer;

/**
 * @author wht
 * @date 2023/8/1 10:27
 */
public class 字符串的最大公因子 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = Math.min(len1,len2); i >= 1; i--) {
            if(len1 % i == 0 && len2 % i == 0){
                String x = str1.substring(0,i);
                if(check(x,str1) && check(x,str2)){
                    System.out.println(x);
                    break;
                }
            }
        }
    }

    private static boolean check(String x, String str) {
        int len = str.length() / x.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(x);
        }
        return str.equals(sb.toString());
    }
}
