import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_快排 {
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
        int x = arr[l+r>>1],i = l - 1,j = r + 1;
        while(i < j){
            do {
                i++;
            }while (arr[i] < x);
            do {
                j--;
            }while(arr[j] > x);
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        quick_sort(arr,l,j);
        quick_sort(arr,j+1,r);
    }
}
