import java.util.Scanner;

public class Main_最长连续不重复子序列 {
    static int[] num = new int[100010];
    static int[] flag = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0,j=0; i < n; i++) {
            flag[num[i]]++;
            while(flag[num[i]] > 1){
                flag[num[j]]--;
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        System.out.println(ans);
    }


}
