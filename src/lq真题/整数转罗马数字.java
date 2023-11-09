package lq真题;

/**
 * @author wht
 * @date 2023/11/7 9:03
 */
public class 整数转罗马数字 {
    public static void main(String[] args) {
        int num = 58;
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(idx < 13){
            while (num >= nums[idx]) {
                sb.append(romans[idx]);
                num -= nums[idx];
            }
            idx++;
        }
        System.out.println(sb.toString());
    }

}
