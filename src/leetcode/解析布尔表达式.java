package leetcode;

import java.util.Scanner;

/**
 * @author wht
 * @date 2022/11/5 9:08
 */
public class 解析布尔表达式 {

    public static void main(String[] args) {
        Character[] ans = new Character[20005];
        int top = 0;
        Scanner sc = new Scanner(System.in);
        String expression = sc.next().replace(",","");
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == ')'){
                // 右括号进行计算
                int a = 0,b = 0;
                while(ans[top-1] != '('){
                    if(ans[--top] == 't'){
                        a++;
                    }else{
                        b++;
                    }
                }
                top--;
                Character opCh = ans[--top];
                switch (opCh){
                    case '!':
                        ans[top++] = a != 0 ? 'f' : 't';
                        break;
                    case '|':
                        ans[top++] = a != 0 ? 't' : 'f';
                        break;
                    case '&':
                        ans[top++] = b != 0 ? 'f' : 't';
                        break;
                    default:
                        break;
                }
            }else{
                ans[top++] = c;
            }
        }
        System.out.println(ans[--top] == 't');
    }
}

// while(sb.length() != 0){
//     String t = String.valueOf(sb.charAt(0));
//     if(ops.contains(t)){
//         if(sb.lastIndexOf("(") == 1){
//             int a = 0,b = 0;
//             int j = 1;
//             while(sb.charAt(j)!=')'){
//                 if(sb.charAt(j) == 't'){
//                     a++;
//                 }else if(sb.charAt(j) == 'f'){
//                     b++;
//                 }
//                 sb.delete(j,j+1);
//             }
//             sb.delete(j,j+1);
//             switch (t){
//                 case "!":
//                 case "|":
//                     if(a != 0){
//                         num.push("t");
//                     }else{
//                         num.push("f");
//                     }
//                     break;
//                 case "&":
//                     if(b != 0){
//                         num.push("f");
//                     }else{
//                         num.push("t");
//                     }
//                     break;
//                 default:
//                     break;
//             }
//         }else{
//             op.push(t);
//         }
//     }
//     sb.delete(0,1);
// }
// while (num.size() != 1 && op.size() != 0){
//     int a = 0,b = 0;
//     String opStr = op.pop();
//
// }
