package 剑指offer;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/9/28 18:01
 */
public class 爱吃香蕉的珂珂 {
    public static void main(String[] args) {
        int[] piles = {312884470};
        int h = 968709470;
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while(l < r){
            int mid = l + r >> 1;
            // 判断是否太大了远远足够警卫回来前吃完
            if(check(mid,piles,h)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        System.out.println(l);
    }

    private static boolean check(int mid, int[] piles, int h) {
        int t = 0;
        for (int i = 0; i < piles.length; i++) {
            t += piles[i] / mid;
            if(piles[i] % mid != 0){
                t++;
            }
        }
        if(t <= h){
            return true;
        }else{
            return false;
        }
    }
}
