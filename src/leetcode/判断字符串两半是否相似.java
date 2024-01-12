package leetcode;

/**
 * @author wht
 * @date 2022/11/11 9:41
 */
public class 判断字符串两半是否相似 {
    public static boolean[] st = new boolean[26];
    public static void main(String[] args) {
        String s = "book".toLowerCase();
        st[0] = true;
        st['e' - 'a'] = true;
        st['i' - 'a'] = true;
        st['o' - 'a'] = true;
        st['u' - 'a'] = true;
        int mid = s.length()/2;
        int a = 0,b = 0;
        for (int i = 0; i < mid; i++) {
            if(st[s.charAt(i) - 'a']){
                a++;
            }
            if(st[s.charAt(mid + i) - 'a']){
                b++;
            }
        }
        if(a == b){
            System.out.println(true);
        }
    }
}
