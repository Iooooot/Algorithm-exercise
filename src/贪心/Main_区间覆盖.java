package 贪心;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wht
 * @date 2022/10/19 9:35
 */
public class Main_区间覆盖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sections.add(new Section(a,b));
        }
        Collections.sort(sections, Comparator.comparingInt(s -> s.l));
        int res = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int j = i, r = (int) -2e9;
            while(j < n && sections.get(j).l <= st){
                r = Math.max(sections.get(j).r,r);
                j++;
            }
            if(r < st){
                flag = false;
                break;
            }
            res++;
            if(r >= end){
                flag = true;
                break;
            }
            st = r;
            i = j - 1;
        }
        if(flag){
            System.out.println(res);
        }else{
            System.out.println(-1);
        }

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
