package leetcode150;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wht
 * @date 2023/12/2 10:34
 */
public class 快乐数 {
    public static void main(String[] args) {
        int n = 2;
        int t = n,sum = 0,cnt = 0;
        Set<Integer> set = new HashSet<>();
        while(sum != 1){
            String s = t + "";
            if(set.contains(t)){
                System.out.println(false);
                break;
            }
            set.add(t);
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int num = Integer.parseInt(s.charAt(i) + "");
                sum += num*num;
            }
            t = sum;
            cnt++;
        }
        System.out.println(true);

    }
}
