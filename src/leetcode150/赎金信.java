package leetcode150;

/**
 * @author wht
 * @date 2023/11/28 9:43
 */
public class 赎金信 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        int[] cnt = new int[100];
        int len = magazine.length();
        int len2 = ransomNote.length();
        for (int i = 0; i < len; i++) {
            int c = magazine.charAt(i) - 'a';
            cnt[c]++;
        }
        for (int i = 0; i < len2; i++) {
            int c = ransomNote.charAt(i) - 'a';
            cnt[c]--;
            if(cnt[c] < 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
