package 剑指offer;

/**
 * @author wht
 * @date 2023/8/22 11:37
 */
public class 寻找数组的中心下标 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int len = nums.length;
        int[] s = new int[len];

        for (int i = 0; i < len; i++) {
            if(i == 0){
                s[0] = nums[0];
            }else{
                s[i] = s[i-1]+nums[i];
            }
        }
        int i;
        for (i = 0; i < len; i++) {
            int suml = s[i] - nums[i];
            int sumr = s[len-1] - s[i];
            if(suml == sumr){
                System.out.println(i);
                break;
            }
        }
        if(i == len){
            System.out.println(-1);
        }
    }
}
