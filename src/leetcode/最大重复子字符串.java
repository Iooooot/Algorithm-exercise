package leetcode;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/11/3 9:42
 */
public class 最大重复子字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(maxRepeating(a,b));
    }

    public static int maxRepeating(String sequence, String word) {
        int lenA = sequence.length();
        int lenB = word.length();
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for (int i = 1; i * lenB <= lenA; i++) {
            sb.append(word);
            if(isSub(sequence,sb.toString())){
                res++;
            }
        }
        return res;
    }

    public static boolean isSub(String sequence, String word) {
        int lenA = sequence.length();
        int lenB = word.length();
        int i = 0;
        for (int j = 0; j < lenB; j++) {
            while(i < lenA && sequence.charAt(i) != word.charAt(j)){
                i++;
            }
            if(i >= lenA){
                return false;
            }
            if(sequence.charAt(i) == word.charAt(j)){
                j++;
            }
        }
        return true;
    }
}
