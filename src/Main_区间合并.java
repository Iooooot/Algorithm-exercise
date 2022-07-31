import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_区间合并 {
    static List<myPair> pairs = new ArrayList<>();
    static List<myPair> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            pairs.add(new myPair(l,r));
        }
        Collections.sort(pairs);
        int l = -1,r = -1;
        for (int i = 0; i < pairs.size(); i++) {
            myPair pair = pairs.get(i);
            if(pair.getX() > r){
                if(r != -1){
                    ans.add(new myPair(l,r));
                }
                l = pair.getX();
                r = pair.getY();
            }else{
                if(pair.getY() > r){
                    r = pair.getY();
                }
            }
        }
        if(r != -1){
            ans.add(new myPair(l,r));
        }
        System.out.println(ans.size());
    }

    private static class myPair implements Comparable{
        private Integer x;
        private Integer y;

        public myPair() {
        }

        public myPair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        @Override
        public int compareTo(Object o) {
            myPair pair01 = (myPair)o;
            if(pair01.getX() != this.getX()){
                return Integer.compare(this.getX(),pair01.getX());
            }else{
                return Integer.compare(this.getY(),pair01.getY());
            }
        }
    }
}
