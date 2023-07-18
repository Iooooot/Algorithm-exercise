package LeetCode100;

import java.util.Arrays;

/**
 * @author wht
 * @date 2023/7/6 9:21
 */
public class 最短无序连续子数组 {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (i <= j && nums[i] == arr[i]){
            i++;
        }
        while (i <= j && nums[j] == arr[j]){
            j--;
        }
        System.out.println(j - i + 1);
    }
}
