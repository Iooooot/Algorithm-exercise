package 贪心;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/16 9:24
 */
public class Main_最大不想交区间数量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sections.add(new Section(a,b));
        }
        Collections.sort(sections, Comparator.comparingInt(s -> s.r));
        int res = 0,end = (int) -2e9;
        for (int i = 0; i < n; i++) {
            if(end < sections.get(i).l){
                res++;
                end = sections.get(i).r;
            }else{
                end = Math.max(sections.get(i).r,end);
            }
        }
        System.out.println(res);
    }
    static class Section{
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
