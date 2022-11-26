package lecture.stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/26
 */
public class 쇠막대기 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            } else {
                if (s.charAt(i - 1) == '(') {
                    stack.pop();
                    result += stack.size();
                }else {
                    stack.pop();
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
