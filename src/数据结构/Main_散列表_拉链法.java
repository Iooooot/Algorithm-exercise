package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_散列表_拉链法 {
    private static int N = 100003,idx;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().split(" ")[0]);
        for(int i = 0 ; i < N ; i++ ){
            h[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            String[] s = reader.readLine().split(" ");
            int num = Integer.parseInt(s[1]);
            if("I".equals(s[0])){
                insert(num);
            }else{
                if(find(num)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }

    }

    private static boolean find(int num) {
        int temp = (num % N + N) % N;
        for (int i = h[temp]; i != -1 ; i = ne[i]) {
            if(e[i] == num){
                return true;
            }
        }
        return false;
    }

    private static void insert(int num) {
        int temp = (num % N + N) % N;
        e[idx] = num;
        ne[idx] = h[temp];
        h[temp] = idx++;
    }
}


