package leetcode150;

/**
 * @author wht
 * @date 2023/11/9 9:03
 */
public class N字形变换 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        int gap = numRows - 1 + numRows - 1,row = 0;
        for (int i = 0; i < numRows; i++) {
            sb.append(s.charAt(i));
            int t = i+gap;
            while(t < len){
                if(row != 0 && row != (numRows-1)){
                    sb.append(s.charAt(t-row-row));
                }
                sb.append(s.charAt(t));
                t += gap;
            }

            if(t == len && row != 0 && row != (numRows-1)){
                sb.append(s.charAt(t-row-row));
            }
            row++;
        }

        System.out.println(sb.toString());
    }
}
