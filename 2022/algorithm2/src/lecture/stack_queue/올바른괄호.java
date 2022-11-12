package lecture.stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/12
 */
public class 올바른괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    flag = false;
                }else {
                    stack.pop();
                }

            }
        }
        if (stack.isEmpty() && flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
