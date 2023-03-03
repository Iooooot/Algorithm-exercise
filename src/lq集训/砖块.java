package lq集训;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wht
 * @date 2023/3/2 9:33
 */
public class 砖块 {
    public static int n;
    static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            n = sc.nextInt();
            str = sc.next();
            if(!check('B') && !check('W')){
                System.out.println(-1);
            }
        }
    }

    private static boolean check(char c) {
        List<Integer> ans = new ArrayList<>();
        String s = str;
        for (int i = 0; i < n -1; i++) {
            if(s.charAt(i) != c){
                s = update(s,i);
                s = update(s,i+1);
                ans.add(i);
            }
        }
        if(s.charAt(n-1) != c){
            return false;
        }
        System.out.println(ans.size());
        for (Integer an : ans) {
            System.out.print(an+1 + " ");
        }
        if(ans.size() != 0){
            System.out.println();
        }

        return true;
    }

    private static String update(String s,int u) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(u) == 'B'){
            sb.deleteCharAt(u);
            sb.insert(u,'W');
        }else{
            sb.deleteCharAt(u);
            sb.insert(u,'B');
        }
        return sb.toString();
    }
}
