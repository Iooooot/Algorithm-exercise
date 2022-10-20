package 贪心;

import java.util.*;

/**
 * @author wht
 * @date 2022/10/17 22:17
 */
public class Main_区间分组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sections.add(new Section(a,b));
        }
        Collections.sort(sections, Comparator.comparingInt(s -> s.l));
        PriorityQueue<Integer> miniQ = new PriorityQueue<Integer>();
        for (int i = 0; i < sections.size(); i++) {
            Section t = sections.get(i);
            if(miniQ.isEmpty() || miniQ.peek() >= t.l){
                miniQ.add(t.r);
            }else{
                miniQ.poll();
                miniQ.add(t.r);
            }
        }
        System.out.println(miniQ.size());
    }
    static class  Section{
        int l;
        int r;

        public Section() {
        }

        public Section(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }
}
