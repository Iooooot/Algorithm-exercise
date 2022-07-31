package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_双链表 {
    static int[] e = new int[100010];
    static int[] lnode = new int[100010];
    static int[] rnode = new int[100010];
    static int idx,head,tail;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().split(" ")[0]);
        //初始化
        head = 0;
        tail = 1;
        idx = 2;
        rnode[head] = tail;
        lnode[tail] = head;
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            String op = s[0];
            int num = Integer.parseInt(s[1]);
            if("L".equals(op)){
                insert(0,num);
            }else if("R".equals(op)){
                insert(lnode[1],num);
            }else if("D".equals(op)){
                remove(num+1);
            } else{
                int num2 = Integer.parseInt(s[2]);
                if("IL".equals(op)){
                    insert(lnode[num+1],num2);
                }else{
                    insert(num+1,num2);
                }
            }
        }
        for (int i = rnode[head]; i != tail; i = rnode[i]) {
            System.out.print(e[i]+" ");
        }
    }

    private static void remove(int k) {
        lnode[rnode[k]] = lnode[k];
        rnode[lnode[k]] = rnode[k];
    }

    private static void insert(int k, int x) {
        e[idx] = x;
        rnode[idx] = rnode[k];
        lnode[idx] = k;
        lnode[rnode[k]] = idx;
        rnode[k] = idx++;
    }


}
