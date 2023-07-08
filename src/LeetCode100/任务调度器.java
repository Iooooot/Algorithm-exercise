package LeetCode100;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/7/7 10:10
 */
public class 任务调度器 {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        int[] cnt = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            cnt[tasks[i] - 'A']++;
        }
        Arrays.sort(cnt);
        int len = (n+1)*(cnt[25]-1) + 1;
        for (int i = 24; i >= 0 ; i--) {
            if(cnt[i] == cnt[25]){
                len++;
            }
        }
        System.out.println(Math.max(len,tasks.length));
    }
}
