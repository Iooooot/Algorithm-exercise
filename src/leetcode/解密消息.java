package leetcode;

/**
 * @author wht
 * @date 2023/2/1 10:58
 */
public class 解密消息 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        char[] map = new char[27];
        int cnt = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if(c != ' '){
                if(map[c - 'a'] == 0){
                    map[c-'a'] = (char) ('a' + cnt);
                    cnt++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                sb.append(' ');
            }else{
                sb.append(map[message.charAt(i) - 'a']);
            }
        }
        System.out.println(sb.toString());
    }
}
