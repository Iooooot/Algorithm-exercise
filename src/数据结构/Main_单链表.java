package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_单链表 {
    static int[] e = new int[100010];
    static int[] ne = new int[100010];
    static int idx,head;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().split(" ")[0]);
        //初始化
        head = -1;
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            String op = s[0];
            int num = Integer.parseInt(s[1]);
            if("H".equals(op)){
                addToHead(num);
            }else if("I".equals(op)){
                int num2 = Integer.parseInt(s[2]);
                insert(num-1,num2);
            }else{
                if(num != 0){
                    remove(num-1);
                }else{
                    head = ne[head];
                }
            }
        }
        for (int i = head; i != -1; i = ne[i]) {
            System.out.print(e[i]+" ");
        }
    }

    private static void remove(int k) {
        ne[k] = ne[ne[k]];
    }

    private static void insert(int k, int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }

    private static void addToHead(int num) {
        e[idx] = num;
        ne[idx] = head;
        head = idx++;
    }
}
