package LeetCode100;

/**
 * @author wht
 * @date 2023/4/16 9:53
 */
public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = 0;
        int i = 0,j = height.length-1;
        while (i < j){
            ans = Math.max(ans,Math.min(height[j], height[i])*(j-i));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(ans);
    }
}
