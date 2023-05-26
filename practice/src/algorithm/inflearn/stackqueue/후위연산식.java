package algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/14
 */
public class 후위연산식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.add(Integer.parseInt(String.valueOf(c)));
            } else {
                Integer calculatedValue = calculate(stack, c);
                stack.add(calculatedValue);
            }
        }
        System.out.println(stack.pop());
    }

    private static Integer calculate(Stack<Integer> stack, char c) {
        Integer firstOperand = stack.pop();
        Integer secondOperand = stack.pop();
        if (c == '+') {
            return secondOperand + firstOperand;
        } else if (c == '-') {
            return secondOperand - firstOperand;
        } else if (c == '*') {
            return secondOperand * firstOperand;
        } else {
            return secondOperand / firstOperand;
        }
    }
}
