package 剑指offer;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/9/26 9:49
 */
public class 咒语和药水的成功对数 {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int l = 0,r = m - 1;
            while(l < r){
                int mid = l + (r - l) / 2;
                if((long) potions[mid] * spells[i] >= success){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }
            if(l == m-1 && (long) potions[l] * spells[i] < success){
                ans[i] = 0;
            }else{
                ans[i] = m - l;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
