package 数据结构;

import java.util.Scanner;

public class Main_散列表_拉链法 {
    static int N = 100003,idx;
    static int[] h = new int[N];
    static int[] e = new int[N];
    static int[] ne = new int[N];
    public static void add(int x){
        int k = (x % N + N) % N;
        e[idx] = x;
        ne[idx] = h[k];
        h[k] = idx ++ ;
    }
    public static boolean find(int x){
        int k = (x % N + N) % N;
        for(int i = h[k];i != -1;i = ne[i]){
            if(e[i] == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        idx = 0;
        for(int i = 0 ; i < N ; i++ ){
            h[i] = -1;
        }
        while(n -- > 0){
            String x = scan.next();
            if(x.equals("I")){
                int a = scan.nextInt();
                add(a);
            }else{
                int b = scan.nextInt();
                if(find(b)) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }

}
