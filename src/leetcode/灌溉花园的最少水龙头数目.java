package leetcode;

/**
 * @author wht
 * @date 2023/2/21 11:21
 */
public class 灌溉花园的最少水龙头数目 {
    public static void main(String[] args) {
        int n = 7;
        int[] ranges = {1,2,1,0,2,1,0,1};
        int[] last = new int[n+1];
        for (int i = 0; i < ranges.length; i++) {
            int l = Math.max(0, i - ranges[i]);
            int r = i + ranges[i];
            last[l] = Math.max(last[l],r);
        }
        int ans = 0,r_max = 0,pre = 0;
        for (int i = 0; i < n; i++) {
            r_max = Math.max(last[i],r_max);
            if(r_max <= i){
                System.out.println(-1);
                break;
            }
            if(pre == i){
                ans++;
                pre = r_max;
            }
        }
        System.out.println(ans);
    }

}
