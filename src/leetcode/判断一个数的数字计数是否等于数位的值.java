package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/1/11 10:46
 */
public class 判断一个数的数字计数是否等于数位的值 {
    public static void main(String[] args) {
        String num = "030";
        int[] nums = new int[11];
        Arrays.fill(nums,0);
        for (int i = 0; i < num.length(); i++) {
            nums[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            int t = Integer.parseInt(num.charAt(i)+"");
            if(t != nums[i]){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
