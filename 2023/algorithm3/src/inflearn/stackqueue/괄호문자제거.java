package inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/13
 */
public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    System.out.print(s.charAt(i));
                }
            }

        }
    }
}
