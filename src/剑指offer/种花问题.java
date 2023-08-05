package 剑指offer;

/**
 * @author wht
 * @date 2023/8/4 10:20
 */
public class 种花问题 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;
        int cnt = 0,max = -1;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] != 0){
                max = Math.max(max,cnt);
                cnt = 0;
            }else{
                cnt++;
            }
        }
        if(max >= (2*n+1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
