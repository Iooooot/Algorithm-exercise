import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_快排02 {
    static int[] arr = new int[100005];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
        }
        quick_sort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void quick_sort(int[] arr, int l, int r) {
        if(l >= r) return;
        int x = arr[l],i = l;
        for (int j = i+1; j <= r; j++) {
            if(arr[j] < x){
                i++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        int t = arr[l];
        arr[l] = arr[i];
        arr[i] = t;
        quick_sort(arr,l,i-1);
        quick_sort(arr,i+1,r);
    }
}
