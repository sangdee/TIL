package lecture.stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/14
 */
public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add('(');
                continue;
            } else if (c == ')') {
                stack.pop();
                continue;
            }
            if (stack.isEmpty()) {
                System.out.print(c);
            }
        }
    }
}
