import java.util.Scanner;

public class Main_判断子序列 {
    static int[] A = new int[100010];
    static int[] B = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
           A[i]  = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            while(j < m && A[i] != B[j]) j++;
            if(j >= m){
                System.out.println("No");
                return;
            }
            if(A[i] == B[j]){
                j++;
            }
        }
        System.out.println("Yes");

    }
}
