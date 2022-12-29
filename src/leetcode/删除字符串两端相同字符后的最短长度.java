package leetcode;

/**
 * @author wht
 * @date 2022/12/28 16:26
 */
public class 删除字符串两端相同字符后的最短长度 {
    public static void main(String[] args) {
        String s = "aabccabba";
        int i = 0,j = s.length() - 1;
        while(i < j && s.charAt(i) == s.charAt(j)){
            while(i + 1 < j && s.charAt(i) == s.charAt(i+1)){
                i++;
            }
            while(i < j - 1 && s.charAt(j) == s.charAt(j-1)){
                j--;
            }
            i++;
            j--;
        }
        System.out.println(j - i + 1);
    }
}
