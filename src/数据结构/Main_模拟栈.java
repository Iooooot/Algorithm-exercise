package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_模拟栈 {
    static int[] stack = new int[100010];
    static int tt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().split(" ")[0]);
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            String op = s[0];
            if("push".equals(op)){
                int num = Integer.parseInt(s[1]);
                pushNum(num);
            }else if("query".equals(op)){
                System.out.println(stack[tt-1]);
            }else if("pop".equals(op)){
                popNum();
            }else{
                if(tt > 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }

    private static void popNum() {
        tt--;
    }

    private static void pushNum(int num) {
        stack[tt++] = num;
    }

}
