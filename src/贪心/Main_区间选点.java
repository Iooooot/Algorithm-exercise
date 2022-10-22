package 贪心;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/15 8:52
 */
public class Main_区间选点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Section section = new Section(a, b);
            sections.add(section);
        }
        Collections.sort(sections, Comparator.comparingInt(s -> s.r));
        int res = 0,r_max = (int) -2e9;
        for (int i = 0; i < n; i++) {
            Section section = sections.get(i);
            if(r_max < section.l){
                res++;
                if(section.r > r_max){
                    r_max = section.r;
                }
            }

        }
        System.out.println(res);
    }
    static class Section {
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
