package 数据结构;


import java.util.Scanner;

public class Main_最大异或对 {
    static int idx = 0;
    static int[][] son = new int[100010][2];
    static int[] nums = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            insert(nums[i]);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,query(nums[i]));
        }
        System.out.println(ans);
    }

    private static long query(int num) {
        int p = 0;
        long temp = 0;
        for (int i = 30; i >= 0; i--) {
            int u = num >> i & 1;
            if(son[p][1-u] != 0){
                //存在不同的数位
                temp += (1 << i);
                p = son[p][1 - u];
            }else{
                p = son[p][u];
            }
        }
        return temp;
    }

    private static void insert(int num) {
        int p = 0;
        for (int i = 30; i >= 0; i--) {
            int u = num >> i & 1;
            if(son[p][u] == 0){
                son[p][u] = ++idx;
            }
            p = son[p][u];
        }
    }

}
