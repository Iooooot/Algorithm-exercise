package leetcode150;

/**
 * @author wht
 * @date 2023/10/31 12:14
 */
public class 加油站 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i < gas.length; i++){
            sum = sum + gas[i] - cost[i];
            if(sum < min && sum < 0){
                min = sum;
                minIndex = i;
            }
        }
        if(sum < 0) {
            System.out.println(-1);
        } else {
            System.out.println((minIndex+1)%gas.length);
        }
    }
    public static int check(int idx,int[] gas,int[] cost){
        int cnt = 0,sum = gas[idx],ans = idx;
        int len = gas.length;
        while(cnt < len){
            sum -= cost[idx];
            if(sum < 0){
                return -1;
            }
            idx = (idx+1)%len;
            if(idx != ans){
                sum += gas[idx];
            }
            cnt++;
        }
        if(sum >= 0){
            return ans;
        }
        return -1;
    }
}
