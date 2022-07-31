import java.util.Scanner;

public class Main_数组元素的目标和 {
    static int[] numA =  new int[100010];
    static int[] numB =  new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            numA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            numB[i] = sc.nextInt();
        }

        int i,j = m - 1;
        for (i = 0;i < n; i++) {
            while(numA[i] + numB[j] > x){
                j--;
            }
            if(numA[i] + numB[j] == x){
                System.out.println(i+" "+j);
                return;
            }
        }
    }
}
