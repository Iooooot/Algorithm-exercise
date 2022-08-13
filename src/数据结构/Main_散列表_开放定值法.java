package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_散列表_开放定值法 {
    private static final int N = 200003;
    private static int[] h = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().split(" ")[0]);
        for(int i = 0 ; i < N ; i++ ){
            h[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            String[] s = reader.readLine().split(" ");
            int num = Integer.parseInt(s[1]);
            if("I".equals(s[0])){
                h[find(num)] = num;
            }else{
                if(h[find(num)] != Integer.MAX_VALUE){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }

    private static int find(int num) {
        int temp = (num % N + N) % N;
        while(h[temp] != Integer.MAX_VALUE && h[temp] != num){
            temp++;
            if(temp == N){
                temp = 0;
            }
        }
        return temp;
    }
}
