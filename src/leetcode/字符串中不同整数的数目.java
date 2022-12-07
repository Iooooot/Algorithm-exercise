package leetcode;

import java.util.HashSet;

/**
 * @author wht
 * @date 2022/12/6 12:16
 */
public class 字符串中不同整数的数目 {
    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                int j = i;
                while(j <word.length() && Character.isDigit(word.charAt(j))){
                    j++;
                }
                while(i < j && word.charAt(i) == '0'){
                    i++;
                }
                set.add(word.substring(i,j));
                i = j;
            }

        }
        System.out.println(set.size());
    }
}
