package 剑指offer;

/**
 * @author wht
 * @date 2023/10/14 10:08
 */
public class 或运算的最小翻转次数 {
    public static void main(String[] args) {
        int a = 4,b = 2,c = 7;
        int max = Math.max(Math.max(a,b), c);
        int cnt = 0,ans = 0;
        while (max > 0) {
            max = max >> 1;
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            int t3 = c >> i & 1;
            int t2 = b >> i & 1;
            int t1 = a >> i & 1;
            if(t3 == 1){
                if(t1 == 0 && t2 == 0){
                    ans++;
                }
            }else{
                if(t2 != 0){
                    ans++;
                }
                if(t1 != 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
