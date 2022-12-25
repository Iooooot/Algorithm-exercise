package leetcode;

/**
 * @author wht
 * @date 2022/12/24 14:19
 */
public class 执行操作后的变量值 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int ans = 0;
        for (String op : operations) {
            char c = op.charAt(0);
            if(c == 'X'){
                if(op.charAt(1) == '+'){
                    ans++;
                }else{
                    ans--;
                }
            }else if(c == '+'){
                ++ans;
            }else{
                --ans;
            }
        }
        System.out.println(ans);
    }
}


