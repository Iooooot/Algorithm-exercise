package lq真题;

/**
 * @author wht
 * @date 2023/11/2 9:26
 */
public class 跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int len = nums.length;
        int maxIdx = 0,end = 0;
        for (int i = 0; i < len - 1; i++) {
            maxIdx = Math.max(maxIdx,i + nums[i]);
            if(i == end){
                end = maxIdx;
            }
        }
        if(end >= len-1){
            System.out.println(true);
        }
    }
}
