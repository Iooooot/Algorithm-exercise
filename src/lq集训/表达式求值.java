package lq集训;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class 表达式求值 {
    static LinkedList<Character> ch = new LinkedList<>();
    static LinkedList<Integer> num = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int x = 0,j = i;
                while(j < s.length() && Character.isDigit(s.charAt(j))){
                    x = x * 10 + s.charAt(j) - '0';
                    j++;
                }
                i = j - 1;
                num.push(x);
            }else if(c == '('){
                ch.push(c);
            } else if(c == ')'){
                while(ch.peek() != '('){
                    eval();
                }
                ch.pop();
            }else{
                while(ch.size() > 0 && ch.peek() != '(' && map.get(c) <= map.get(ch.peek())){
                    eval();
                }
                ch.push(c);
            }
        }
        while(ch.size() > 0){
            eval();
        }
        System.out.println(num.pop());
    }
    static void eval()
    {
        Integer b = num.peek();
        num.pop();
        Integer a = num.peek();
        num.pop();
        Character c = ch.peek();
        ch.pop();
        int x;
        if (c == '+') x = a + b;
        else if (c == '-') x = a - b;
        else if (c == '*') x = a * b;
        else x = a / b;
        num.push(x);
    }
}
