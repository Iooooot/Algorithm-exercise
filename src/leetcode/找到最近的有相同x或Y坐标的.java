package leetcode;

/**
 * @author wht
 * @date 2022/12/1 11:24
 */
public class 找到最近的有相同x或Y坐标的 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{2,3}};
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < points.length; i++) {
            if(points[i][0] == x || points[i][1] == y){
                int d = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if(d < min){
                    min = d;
                    idx = i;
                }else if(d == min){
                    if(points[i][0] < x){
                        idx = i;
                    }else if(points[i][0] == x){
                        if(points[i][1] < y){
                            idx = i;
                        }
                    }
                }
            }
        }
        if(idx == -1){
            System.out.println(-1);
        }else if(points[idx][0] == x && points[idx][1] == y){
            System.out.println(0);
        }else{
            System.out.println(points[idx][0]);
        }
    }
}
