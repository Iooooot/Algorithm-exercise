import java.util.Scanner;

public class Main_浮点二分 {
    public static void main(String[] args) {
        Double n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        double l = -10000,r = 10000;
        while(r - l > 1e-8){
            double mid = (l+r)/2;
            if(mid * mid * mid >= n) r = mid;
            else l = mid;
        }
        System.out.printf("%.6f",l);
    }
}
