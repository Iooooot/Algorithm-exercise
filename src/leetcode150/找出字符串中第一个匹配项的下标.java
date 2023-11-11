package leetcode150;

/**
 * @author wht
 * @date 2023/11/10 9:15
 */
public class 找出字符串中第一个匹配项的下标 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 > len1){
            return;
        }
        int idx = -1;
        for (int i = 0; i < len1 - len2 + 1; i++) {
            int a = i,b = 0;
            while(b < len2 && haystack.charAt(a) == needle.charAt(b)){
                a++;
                b++;
            }
            if(b == len2){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
