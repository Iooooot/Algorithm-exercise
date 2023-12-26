package leetcode150;

/**
 * @author wht
 * @date 2023/11/12 10:21
 */
public class 验证回文串 {
    public static void main(String[] args) {
        String s = "0P";
        boolean flag = true;
        int i = 0,j = s.length()-1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
}
