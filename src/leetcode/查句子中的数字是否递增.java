package leetcode;

/**
 * @author wht
 * @date 2023/1/5 10:16
 */
public class 查句子中的数字是否递增 {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        int pre = -1;
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            if(s2.charAt(0) >= 'a' && s2.charAt(0) <= 'z'){
                continue;
            }
            int t = Integer.parseInt(s2);
            if(t <= pre){
                System.out.println(false);
                break;
            }
            pre = t;
        }
        System.out.println(true);
    }
}
