package lq真题;

/**
 * @author wht
 * @date 2023/11/4 9:20
 */
public class 分发糖果 {
    public static void main(String[] args) {
        int[] ratings = {1,2,87,87,87,2,1};
        int len = ratings.length;
        int sum=0;
        int right=0;
        int[] left = new int[len];
        for(int i=0;i<len;i++){
            if(i>0&&ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else{
                left[i]=1;
            }
        }
        for(int i=len-1;i>=0;i--){
            if(i<len-1&&ratings[i]>ratings[i+1]){
                right++;
            }else{
                right=1;
            }
            sum+=Math.max(right,left[i]);
        }
        System.out.println(sum);
    }
}
