package lq集训;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/3 10:07
 */
public class 树的遍历 {
    static int n;
    static int[] hx = new int[35];
    static int[] zx = new int[35];
    static int[] idx = new int[35];
    static int[] l = new int[35];
    static int[] r = new int[35];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            hx[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            zx[i] = sc.nextInt();
        }
        // 记录中序的元素坐标
        for (int i = 0; i < n; i++) {
            idx[zx[i]] = i;
        }
        // 递归构建树
        build(0,n - 1,0,n - 1);

        // bfs层序遍历
        bfs();
    }

    private static void bfs() {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(hx[n-1]);
        while(q.size() != 0){
            Integer t = q.poll();
            System.out.print(t+" ");
            if(l[t] != 0){
                q.add(l[t]);
            }
            if(r[t] != 0){
                q.add(r[t]);
            }
        }
    }

    private static int build(int al, int ar, int bl, int br) {
        if(al > ar){
            return 0;
        }
        int val = hx[ar];
        int k = idx[val];
        // 遍历左右子树
        l[val] = build(al,al + k - 1 - bl,bl,k-1);
        r[val] = build(al + k - bl,ar-1,k+1,br);
        return val;
    }
}
