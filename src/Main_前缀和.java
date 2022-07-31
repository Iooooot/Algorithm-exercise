import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_前缀和 {
    static int[] arr = new int[100010];
    static int[] sum = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(s1[i-1]);
            sum[i] = sum[i-1] + arr[i];
        }
        while(m-- > 0){
            String[] s2 = br.readLine().split(" ");
            int l = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            System.out.println(sum[r] - sum[l-1]);
        }
    }
}
