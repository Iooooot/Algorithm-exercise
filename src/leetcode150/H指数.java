package leetcode150;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/10/29 9:24
 */
public class H指数 {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        System.out.println(h);
    }
}
