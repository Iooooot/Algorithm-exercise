import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_归并 {
    static int[] arr = new int[100005];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        merge_sort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void merge_sort(int[] arr, int l, int r) {
        if(l >= r) return;
        int mid = l + r >> 1;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        //合并
        int[] temp = new int[r - l + 1];
        int i,j,k;
        for (i = l,j = mid + 1,k = 0;i <= mid && j <= r; k++) {
            if(arr[i] <= arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];
            }
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];
        for (int m = 0; m < k; m++) {
            arr[m+l] = temp[m];
        }
    }
}
