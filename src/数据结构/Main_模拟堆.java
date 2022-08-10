package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_模拟堆 {
    private static int[] h = new int[100010];
    private static int size;
    private static int[] hi = new int[100010];
    private static int[] ih = new int[100010];
    private static int idx;
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            if("I".equals(s[0])){
                //插入
                int num = Integer.parseInt(s[1]);
                h[++size] = num;
                ih[++idx] = size;
                hi[size] = idx;
                up(size);
            }else if("PM".equals(s[0])){
                //输出最小值
                System.out.println(h[1]);
            }else if("DM".equals(s[0])){
                //删除最小值
                hswap(1,size);
                size--;
                down(1);
            }else if("D".equals(s[0])){
                //删除第k个数
                int k = Integer.parseInt(s[1]);
                int u = ih[k];
                hswap(u,size);
                size--;
                up(u);
                down(u);
            }else{
                //修改第k个插入的数
                int k = Integer.parseInt(s[1]);
                int x = Integer.parseInt(s[2]);
                int u = ih[k];
                h[u] = x;
                down(u);
                up(u);
            }
        }

    }

    private static void down(int u) {
        int t = u;
        if(u * 2 <= size && h[u * 2] < h[t]){
            t = u * 2;
        }
        if(u * 2 + 1 <= size && h[u * 2 + 1] < h[t]){
            t = u * 2 + 1;
        }
        if(t != u){
            hswap(u,t);
            down(t);
        }
    }

    private static void up(int u) {
        while(u / 2 > 0 && h[u] < h[u / 2]){
            hswap(u,u/2);
            u /= 2;
        }
    }

    private static void hswap(int a, int b) {
        swap(hi,a,b);
        swap(ih,hi[a],hi[b]);
        swap(h,a,b);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
