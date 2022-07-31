import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_差分 {
    static int[] cf = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(s1[i-1]);
            insert(i,i,num);
        }
        while(m-- > 0){
            String[] s2 = br.readLine().split(" ");
            int l = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            int c = Integer.parseInt(s2[2]);
            insert(l,r,c);
        }
        for (int i = 1; i <= n; i++) {
            cf[i] += cf[i-1];
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(cf[i]+" ");
        }
    }

    private static void insert(int l, int r, int num) {
        cf[l] += num;
        cf[r+1] -= num;
    }
}
