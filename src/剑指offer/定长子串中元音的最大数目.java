package 剑指offer;

/**
 * @author wht
 * @date 2023/8/18 10:49
 */
public class 定长子串中元音的最大数目 {
    static int[] que = new int[100010];
    static int tt,rr=-1;
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(tt<=rr&&que[tt] < i - k + 1){
                if(check(s.charAt(que[tt]))){
                    cnt--;
                }
                tt++;
            }

            que[++rr] = i;
            if(check(s.charAt(i))){
                cnt++;
            }
            if(i >= k - 1){
                ans = Math.max(ans,cnt);
            }
        }
        System.out.println(ans);
    }

    private static boolean check(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

}
