package leetcode150;

/**
 * @author wht
 * @date 2023/11/14 9:22
 */
public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] height = {1,1};
        int i = 0,j = height.length-1,max = -1;
        while(i < j){
            int sum = Math.min(height[i],height[j])*(j-i);
            if(sum > max){
                max = sum;
            }
            if(height[i] >= height[j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(max);
    }
}
