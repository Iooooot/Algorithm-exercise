package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 * @date 2023/7/14 10:28
 */
public class 逆序对的数量 {
    static int[] arr = new int[100005];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        while(q-- > 0){
            int num = Integer.parseInt(br.readLine());
            int l = 0,r = n-1;
            while(l < r){
                int mid = (l + r) >> 1;
                if(arr[mid] >= num){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }
            if(arr[l] != num){
                System.out.println("-1 -1");
            }else{
                int ans1 = l;
                r = n - 1;
                while(l < r){
                    int mid = l + r + 1 >> 1;
                    if(arr[mid] <= num) l = mid;
                    else r = mid - 1;
                }
                int ans2 = l;
                System.out.println(ans1+" "+ans2);
            }
        }
    }

}
