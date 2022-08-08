package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_连通块中点的数量 {
    private static int[] p = new int[100010];
    private static int[] cnt = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        for (int i = 1; i <= n; i++) {
            p[i] = i;
            cnt[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            String[] ops = reader.readLine().split(" ");
            if("C".equals(ops[0])){
                //合并，有可能是自连接
                int a = Integer.parseInt(ops[1]);
                int b = Integer.parseInt(ops[2]);
                if(find(a) == find(b)) {
                    //如果一个集合就不需要再进行操作了
                    continue;
                }
                cnt[find(b)] += cnt[find(a)];
                p[find(a)] = find(b);
            }else if("Q1".equals(ops[0])){
                //判断是否在同一个连通块
                int a = Integer.parseInt(ops[1]);
                int b = Integer.parseInt(ops[2]);
                if(find(a) == find(b)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                //该集合数量
                int a = Integer.parseInt(ops[1]);
                System.out.println(cnt[find(a)]);
            }
        }
    }

    private static int find(int x) {
        if(p[x] != x){
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
