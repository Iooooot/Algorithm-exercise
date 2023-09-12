package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wht
 * @date 2023/8/3 10:26
 */
public class 拥有最多糖果的孩子 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int max = Arrays.stream(candies).max().getAsInt();
        boolean[] ans = new boolean[candies.length];
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= max);
        }
    }
}
