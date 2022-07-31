import java.util.Scanner;

public class Main_二进制中1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int ans = 0;
            while(num!=0){
                num -= lowbit(num);
                ans++;
            }
            System.out.println(ans + " ");
        }
    }

    private static int lowbit(int num) {
        return num & -num;
    }
}
