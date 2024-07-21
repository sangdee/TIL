package temp;

import java.util.Scanner;
import java.util.Stack;

public class 교육과정설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String successOrder = sc.next();
        String currentOrder = sc.next();

        solution(successOrder, currentOrder);
    }

    private static void solution(String successOrder, String currentOrder) {
        Stack<Character> stack = new Stack<>();
        for (int i = successOrder.length() - 1; i >= 0; i--) {
            stack.add(successOrder.charAt(i));
        }

        for (int i = 0; i < currentOrder.length(); i++) {
            if (stack.isEmpty()) {
                break;
            }
            if (stack.peek() == currentOrder.charAt(i)) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
