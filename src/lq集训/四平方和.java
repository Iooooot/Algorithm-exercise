package lq集训;

import java.util.*;


public class 四平方和 {
    static List<node> nodes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int c = 0; c*c <= n; c++) {
            for (int d = c; d * d + c * c <= n; d++) {
                nodes.add(new node(d*d + c*c,c,d));
            }
        }
        Collections.sort(nodes,(s1,s2) ->{
            if(s1.s != s2.s) {
                return s1.s - s2.s;
            }
            if(s1.a != s2.a) {
                return s1.a - s2.a;
            }
            return s1.b - s2.b;
        });
        for (int a = 0; a * a <= n; a++) {
            for (int b = a; b * b + a * a<= n; b++) {
                int t = n - a * a - b * b;
                int l = 0,r = nodes.size() -1;
                while(l < r){
                    int mid = l + r >> 1;
                    if(nodes.get(mid).s >= t){
                        r = mid;
                    }else{
                        l = mid + 1;
                    }
                }
                if(nodes.get(l).s == t){
                    System.out.println(a+" "+b+" "+nodes.get(l).a+" "+nodes.get(l).b);
                    return;
                }
            }
        }
    }

    private static class node {
        int s;
        int a,b;

        public node() {
        }

        public node(int s, int a, int b) {
            this.s = s;
            this.a = a;
            this.b = b;
        }
    }
}
