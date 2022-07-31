import javafx.util.Pair;

import java.util.*;

public class Main_区间和 {
    static int[] a = new int[300010];
    static int[] s = new int[300010];
    static List<Pair<Integer,Integer>> addPair = new ArrayList<>();
    static List<Pair<Integer,Integer>> askPair = new ArrayList<>();
    static List<Integer> all = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int c = sc.nextInt();
            addPair.add(new Pair<>(x,c));
            all.add(x);
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            askPair.add(new Pair<>(l,r));
            all.add(l);
            all.add(r);
        }
        Collections.sort(all);
        //去重
        unique(all);

        for (int i = 0; i < addPair.size(); i++) {
            int x = find(addPair.get(i).getKey());
            a[x] = addPair.get(i).getValue();
        }
        for (int i = 1; i <= all.size(); i++) {
            s[i] = s[i-1] + a[i];
        }

        for (int i = 0; i < askPair.size(); i++) {
            int l = find(askPair.get(i).getKey());
            int r = find(askPair.get(i).getValue());
            System.out.println(s[r] - s[l-1]);
        }

    }

    private static int find(Integer x) {
        int l = 0,r = all.size();
        while(l < r){
            int mid = l + r >> 1;
            if(all.get(mid) >= x) r = mid;
            else l = mid + 1;
        }
        return l+1;
    }

    private static void unique(List<Integer> list) {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i == 0 || list.get(i) != list.get(i-1)){
                list.set(j++,list.get(i));
            }
        }
        list.subList(0,j);
    }
}
