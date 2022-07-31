package 数据结构;

import java.io.*;

public class Main_KMP {
    static int[] ne = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(br.readLine());
        String p = " " + br.readLine();
        Integer m = Integer.parseInt(br.readLine());
        String s = " " + br.readLine();
        for (int i = 2,j=0; i <= n; i++) {
            while(j!=0&&p.charAt(i)!=p.charAt(j+1)){
                j = ne[j];
            }
            if(p.charAt(i)==p.charAt(j+1)){
                j++;
            }
            ne[i] = j;
        }

        for (int i = 1,j=0; i <= m; i++) {
            while(j!=0&&s.charAt(i)!=p.charAt(j+1)){
                j = ne[j];
            }
            if(s.charAt(i)==p.charAt(j+1)){
                j++;
            }
            if(j==n){
                bw.write((i-n)+ " ");
                j = ne[j];
            }
        }
        bw.flush();
    }
}
