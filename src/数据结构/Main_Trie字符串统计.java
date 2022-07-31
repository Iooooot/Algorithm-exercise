package 数据结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wht
 */
public class Main_Trie字符串统计 {
    static int idx = 0;
    static final int N = 100010;
    static int[] cnt = new int[N];
    static int[][] son = new int[N][26];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().split(" ")[0]);
        while(n-- > 0){
            String[] str = reader.readLine().split(" ");

            if(str[0].equals("I")){
                // 插入
                insert(str[1]);
            }else{
                // 查询
                System.out.println(query(str[1]));
            }
        }

    }

    private static int query(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if(son[p][u] == 0){
                return 0;
            }
            p = son[p][u];
        }
        return cnt[p];
    }

    private static void insert(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if(son[p][u] == 0){
                son[p][u] = ++idx;
            }
            p = son[p][u];
        }
        cnt[p]++;
    }
}
