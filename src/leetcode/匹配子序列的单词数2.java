package leetcode;

/**
 * @author wht
 * @date 2022/11/17 10:23
 */
public class 匹配子序列的单词数2 {
    public static int[][] son = new int[100010][27];
    public static int[] cnt = new int[100010];
    public static int idx;
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        insert(s);
        int res = 0;
        for (String word : words) {
            if(query(word) != 0){
                res++;
            }
        }
        System.out.println(res);
    }

    private static void insert(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if(son[p][u] == 0){
                son[p][u] = ++idx;
                cnt[p]++;
            }
            p = son[p][u];
        }
    }

    private static int query(String word){
        int p = 0;
        for (int i = 0; i < word.length(); i++) {
            int u = word.charAt(i) - 'a';
            if(son[p][u] == 0){
                return 0;
            }
            p = son[p][u];
        }
        return cnt[p];
    }
}
