package 剑指offer;

/**
 * @author wht
 * @date 2023/8/14 14:11
 */
public class 判断子序列 {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        int len = s.length();
        boolean flag = false;
        int i,j;
        for (i = 0,j = 0; i < len; i++) {
            while(j < t.length() && t.charAt(j) != s.charAt(i)){
                j++;
            }
            if(j >= t.length()){
                break;
            }
            if(t.charAt(j) == s.charAt(i)){
                j++;
            }
        }
        if(i == len){
            flag = true;
        }
        System.out.println(flag);
    }
}
