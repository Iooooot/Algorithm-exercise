package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_食物链 {
    private static int[] p = new int[100010];
    private static int[] dis = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        for (int i = 0; i < k; i++) {
            String[] nums = reader.readLine().split(" ");
            int x = Integer.parseInt(nums[1]);
            int y = Integer.parseInt(nums[2]);
            if(x > n || y > n){
                cnt++;
                continue;
            }
            int px = find(x);
            int py = find(y);
            if("1".equals(nums[0])){
                //x,y是同类
                if(px == py && (dis[x] - dis[y]) % 3 != 0){
                    cnt++;
                }else if(px != py){
                    p[px] = py;
                    dis[px] = dis[y] - dis[x];
                }
            }else{
                //x吃y
                if(px == py && (dis[x] - dis[y] - 1) % 3 != 0){
                    cnt++;
                }else if(px != py){
                    p[px] = py;
                    dis[px] = dis[y] + 1 -dis[x];
                }
            }
        }
        System.out.println(cnt);
    }

    private static int find(int x) {
        if(p[x] != x){
            int u = find(p[x]);
            dis[x] += dis[p[x]];
            p[x] = u;
        }
        return p[x];
    }
}
