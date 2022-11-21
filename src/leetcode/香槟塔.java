package leetcode;

/**
 * @author wht
 * @date 2022/11/20 10:23
 */
public class 香槟塔 {
    public static void main(String[] args) {
        int poured = 100000009;
        int query_row = 33;
        int query_glass = 17;
        double[][] f = new double[query_row + 5][query_row + 5];
        f[0][0] = 100000009;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if(f[i][j] <= 1){
                    continue;
                }
                f[i+1][j] += (f[i][j] - 1) / 2;
                f[i+1][j + 1] += (f[i][j]-1) / 2;
            }
        }
        System.out.println(Math.min(1,f[query_row][query_glass]));
    }
}
