package leetcode;

/**
 * @author wht
 * @date 2023/1/9 11:33
 */
public class 还原排列的最少操作步数 {
    public int reinitializePermutation(int n) {
        int[] arr = new int[n];
        int[] perm = new int[n];
        for(int i = 0;i < n;i++){
            perm[i] = i;
        }
        int cnt = 1;
        while(true){
            for(int i = 0; i < n;i++){
                arr[i] = (i%2) == 0 ? perm[i / 2] : perm[(n + i - 1) / 2];
            }
            boolean flag = true;
            for(int i = 0; i < n;i++){
                if(arr[i] != i){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return cnt;
            }
            for (int i = 0; i < n; i++){
                perm[i] = arr[i];
            }
            cnt++;
        }
    }
}
