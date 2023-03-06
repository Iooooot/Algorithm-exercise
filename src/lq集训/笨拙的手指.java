package lq集训;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/5 9:22
 */
public class 笨拙的手指 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        char[] s2 = sc.next().toCharArray();
        char[] s3 = sc.next().toCharArray();
        int res = -Integer.MAX_VALUE;
        for (int i = 0; i < s2.length; i++) {
            s2[i] ^= 1;
            map.put(get(s2,2), 1);
            s2[i] ^= 1;
        }
        for (int i = 0; i < s3.length; i++) {
            char ch = s3[i];
            for (char j = '0'; j <= '2'; j++) {
                if(ch - '0' == j){
                    continue;
                }
                s3[i] = j;
                int t = get(s3, 3);
                if(map.containsKey(t)){
                    res = Math.max(res,t);
                }
            }
            s3[i] = ch;
        }
        System.out.println(res);
    }

    private static int get(char[] s2, int b) {
        int res = 0;
        for (int i = 0; i < s2.length; i++) {
            res = res * b + (s2[i] - '0');
        }
        return res;
    }
}
