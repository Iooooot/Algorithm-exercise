package leetcode;

/**
 * @author wht
 * @date 2022/12/13 15:52
 */
public class 判断句子是否为全字母句 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            char t = (char) ('a' + i);
            if(!sentence.contains(t + "")){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
