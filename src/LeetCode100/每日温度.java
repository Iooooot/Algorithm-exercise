package LeetCode100;

/**
 * @author wht
 * @date 2023/7/9 9:52
 */
public class 每日温度 {
    static int[] stk = new int[100010];
    static int tt;
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int len = temperatures.length;
        int[] ans = new int[len];
        for (int i = len-1; i >= 0; i--) {
            while(tt > 0 && temperatures[stk[tt-1]] <= temperatures[i]){
                tt--;
            }
            if(tt == 0){
                ans[i] = 0;
            }else{
                ans[i] = stk[tt-1] - i;
            }
            stk[tt++] = i;
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
