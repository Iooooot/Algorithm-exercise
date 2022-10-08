package 动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author wht
 * @date 2022/10/8 8:53
 */
public class Main_计数问题 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = in.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        while(a != 0 || b != 0){
            if (a > b){
                int t = a;
                a = b;
                b = t;
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(numCount(b,i) - numCount(a - 1,i));
                System.out.print(" ");
            }
            System.out.println();
            String[] cur = in.readLine().split(" ");
            a = Integer.parseInt(cur[0]);
            b = Integer.parseInt(cur[1]);
        }
    }

    private static int numCount(int n,int x) {
        if(n == 0){
            return 0;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while(n != 0){
            nums.add(n%10);
            n /= 10;
        }
        n = nums.size();
        int t = x == 0 ? 1 : 0;
        int res = 0;
        for (int i = n - 1 - t; i >= 0; i--) {
            if(i < n - 1){
                res += getSum(nums,n-1,i+1) * power10(i);
                if(x == 0){
                    res -= power10(i);
                }
            }
            if(nums.get(i) == x){
                res += getSum(nums,i - 1,0) + 1;
            }else if(nums.get(i) > x){
                res += power10(i);
            }
        }
        return res;
    }

    static int power10(int x){
        int res = 1;
        while(x!=0){
            res *= 10;
            x--;
        }
        return res;
    }

    private static int getSum(ArrayList<Integer> nums, int l, int r) {
        int res = 0;
        for (int i = l; i >= r; i--) {
            res = res * 10 + nums.get(i);
        }
        return res;
    }
}
