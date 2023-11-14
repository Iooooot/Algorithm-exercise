package leetcode150;

/**
 * @author wht
 * @date 2023/11/13 9:45
 */
public class 两数之和II输入有序数组 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        int i = 0,j = numbers.length-1;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                System.out.println(i+1+" "+(j+1));
                break;
            }
            if(sum > target){
                j--;
            }else{
                i++;
            }
        }
    }
}
