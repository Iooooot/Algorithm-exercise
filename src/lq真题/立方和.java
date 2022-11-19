package lq真题;

/**
 * @author wht
 * @date 2022/11/7 9:54
 */
public class 立方和 {
    public static void main(String[] args) {
        long res = 0;
        for (int i = 1; i <= 40; i++) {
            if(String.valueOf(i).contains("2") || String.valueOf(i).contains("0") || String.valueOf(i).contains("1") || String.valueOf(i).contains("9")){
                res += (i*i);
            }
        }
        System.out.println(res);
    }
}
