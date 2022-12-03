package leetcode;

/**
 * @author wht
 * @date 2022/12/2 11:41
 */
public class 移动所有球到每个盒子所需的最小操作数 {
    public static void main(String[] args) {
        String boxes = "110";
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if(j == i || boxes.charAt(j) == '0'){
                    continue;
                }
                cnt += Math.abs(j - i);
            }
            ans[i] = cnt;
        }
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
