package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/2/20 15:30
 */
public class 最好的扑克手牌 {
    public static void main(String[] args) {
        int[] ranks = {4,4,2,4,4};
        String[] suits = {"d","a","a","b","c"};
        int[] map = new int[14];
        Arrays.fill(map,0);
        boolean f1 = true;
        int cnt = 0;
        for (int i = 0; i < ranks.length; i++) {
            if(!suits[0].equals(suits[i])){
                f1 = false;
            }
            map[ranks[i]] += 1;
        }
        for (int i = 0; i < ranks.length; i++) {
            cnt = Math.max(map[ranks[i]],cnt);
        }
        if(f1){
            System.out.println("Flush");
        }else if(cnt >= 3){
            System.out.println("Three of a Kind");
        }else if(cnt == 2){
            System.out.println("Pair");
        }else if(cnt == 1){
            System.out.println("High Card");
        }
    }
}
