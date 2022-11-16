package leetcode;

import java.util.Arrays;

/**
 * @author wht
 * @date 2022/11/15 9:45
 */
public class 卡车上的最大单元数 {
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        Arrays.sort(boxTypes,(b1,b2) -> b2[1] - b1[1]);
        int ans = 0;
        for (int[] boxType : boxTypes) {
            if(boxType[0] < truckSize){
                ans += (boxType[0]*boxType[1]);
                truckSize -= boxType[0];
            }else{
                ans += (boxType[1]*truckSize);
                break;
            }
        }
        System.out.println(ans);
    }
}
