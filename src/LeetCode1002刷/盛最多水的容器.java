package LeetCode1002刷;

/**
 * @author wht
 * @date 2024/1/11 12:37
 */
public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = -1;
        int i = 0,j = height.length - 1;
        while(i < j){
            int temp = Math.min(height[i],height[j]) * (j - i);
            max = Math.max(max,temp);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(max);
    }
}
