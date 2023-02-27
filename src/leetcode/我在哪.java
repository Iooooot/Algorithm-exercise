package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class 我在哪 {
    static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.next();
        int l = 1,r = n;
        while(l < r){
            int mid = l + r >> 1;
            if(check(mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }

        System.out.println(l);
    }

    public static boolean check(int len){
        Set<String> set = new HashSet<>();
        for (int i = 0; i + len - 1 < s.length(); i++) {
            String t = s.substring(i, i+len);
            if(set.contains(t)){
                return false;
            }
            set.add(t);
        }
        return true;
    }
}
