package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2022/11/19 10:45
 */
public class 找到最高海拔 {
    public static void main(String[] args) {
        // int[] gain = {-4,-3,-2,-1,4,3,2};
        // int res = 0,ans = 0;
        // for (int i = 0; i < gain.length; i++) {
        //     res += gain[i];
        //     ans = Math.max(ans,res);
        // }
        // System.out.println(ans);
        System.out.println(nthMagicalNumber(5,2,4));
    }

    public static int nthMagicalNumber(int n, int a, int b) {
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        int[] num = new int[n+5];
        int cnt = n / 2;
        for(int i = 0;i < cnt;i++){
            num[2*i] = (a * (i + 1)) % (int)(1e9 + 7);
            num[2*i + 1] = (b * (i + 1)) % (int)(1e9 + 7);
        }
        if(n % 2 != 0){
            num[n-1] = (a * cnt % (int)(1e9 + 7) + a) % (int)(1e9 + 7) ;
        }
        Arrays.sort(num,0,n);
        return num[n-1] % (int)(1e9 + 7);
    }
}
