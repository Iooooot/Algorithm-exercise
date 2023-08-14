package 剑指offer;

/**
 * @author wht
 * @date 2023/8/13 15:52
 */
public class 压缩字符串 {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int len = chars.length;
        int cnt = 0,s = 0;
        for (int i = 0,j = i+1; i < len; i++) {
            while(j < len && chars[j] == chars[i]){
                j++;
            }
            chars[cnt] = chars[i];
            s++;
            cnt++;
            if(j != i +1){
                int gap = j - i;
                StringBuilder sb = new StringBuilder();
                while(gap != 0){
                    cnt++;
                    int t = gap%10;
                    sb.append(t);
                    gap /= 10;
                }
                for (int k = 0; k < sb.length(); k++) {
                    chars[s] = sb.charAt(sb.length()-1-k);
                    s++;
                }
            }
            i = j-1;
        }
        System.out.println(cnt);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
