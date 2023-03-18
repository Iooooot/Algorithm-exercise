package lq集训;

/**
 * @author wht
 * @date 2023/3/4 9:23
 */
public class 按位与为零的三元组 {
    static int[] ans = new int[3];
    static int cnt;
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        dfs(nums,0);
        System.out.println(cnt);
    }

    private static void dfs(int[] nums,int u) {
        if(u > 2){
            int t = ans[0];
            for (int i = 1; i < 3; i++) {
                t &= ans[i];
            }
            if(t == 0){
                cnt++;
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[u] = nums[i];
            dfs(nums,u+1);
        }
    }
}
