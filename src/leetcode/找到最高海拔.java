package leetcode;

/**
 * @author wht
 * @date 2022/11/19 10:45
 */
public class 找到最高海拔 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int res = 0,ans = 0;
        for (int i = 0; i < gain.length; i++) {
            res += gain[i];
            ans = Math.max(ans,res);
        }
        System.out.println(ans);
    }
}
