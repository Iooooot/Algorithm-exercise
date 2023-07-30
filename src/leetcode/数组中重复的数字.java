package leetcode;

import java.util.HashSet;

/**
 * @author wht
 * @date 2023/7/28 10:02
 */
public class 数组中重复的数字 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                System.out.println(num);
                break;
            }else{
                set.add(num);
            }
        }
    }
}
