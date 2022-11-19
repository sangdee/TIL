package lecture.stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/14
 */
public class 후위식연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.add(c - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+') {
                    stack.add(lt + rt);
                } else if (c == '-') {
                    stack.add(lt - rt);
                } else if (c == '*') {
                    stack.add(lt * rt);
                } else if (c == '/') {
                    stack.add(lt / rt);
                }
            }
        }
        System.out.println(stack.get(0));
    }
}
