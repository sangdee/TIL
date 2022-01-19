package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

import java.util.Stack;

/**
 * s	result
 * baabaa	1
 * cdcd	    0
 */
public class 짝지어제거하기 {
    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
}
