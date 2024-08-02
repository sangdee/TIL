package algorithm.leetcode;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        List<Character> list = List.of('(', '{', '[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                stack.add(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                Character peek = stack.peek();
                if (peek == '(' && c == ')') {
                    stack.pop();
                } else if (peek == '{' && c == '}') {
                    stack.pop();
                } else if (peek == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
