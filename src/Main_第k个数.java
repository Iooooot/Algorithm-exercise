import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_第k个数 {
    static int[] arr = new int[100010];
    static int n,k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        n = Integer.parseInt(s1[0]);
        k = Integer.parseInt(s1[1]);
        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s2[i]);
        }
        quick_sort(0,n-1);
    }

    private static void quick_sort(int l, int r) {
        if(l == r){
            System.out.println(arr[l]);
            return;
        }
        int x = arr[l + r >> 1],i = l - 1,j = r + 1;
        while(i < j){
            do{
                i++;
            }while(arr[i] < x);
            do{
                j--;
            }while(arr[j] > x);
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        if(j+1 >= k){
            quick_sort(l,j);
        }else{
            quick_sort(j+1,r);
        }
    }
}
