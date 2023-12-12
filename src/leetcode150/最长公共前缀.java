package leetcode150;

/**
 * @author wht
 * @date 2023/11/8 9:20
 */
public class 最长公共前缀 {
    static int idx = 0;
    static final int N = 100010;
    static int[] cnt = new int[N];
    static int[][] son = new int[N][26];
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        for (String str : strs) {
            insert(str);
        }
        System.out.println(query(strs[0],strs.length));
    }
    private static String query(String s,int len) {
        int p = 0;
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if(son[p][u] == 0){
                return "";
            }
            p = son[p][u];
            if(cnt[p] == len){
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    private static void insert(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if(son[p][u] == 0){
                son[p][u] = ++idx;
            }
            p = son[p][u];
            cnt[p]++;
        }
    }
}
