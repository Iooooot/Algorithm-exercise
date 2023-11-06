package lq真题;

/**
 * @author wht
 * @date 2023/11/5 9:11
 */
public class 接雨水 {
    public static void main(String[] args) {
        int[] height = {4,2,3};
        int l = 0,r = height.length-1,ans = 0;
        int lmax = -Integer.MAX_VALUE,rmax = -Integer.MAX_VALUE;
        while(l <= r){
            if(height[l] < height[r]){
                if(height[l] > lmax){
                    lmax = height[l];
                }else{
                    ans += (lmax - height[l]);
                }
                l++;
            }else{
                if(height[r] > rmax){
                    rmax = height[r];
                }else{
                    ans += (rmax - height[r]);
                }
                r--;
            }
        }
        System.out.println(ans);
    }
}
