package algorithm.inflearn.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */
public class 회문문자열 {
    //sssssssssssssssksssssssssssssss
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        boolean checkMid = false;
        if (s.length() % 2 == 0) {
            checkMid = true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!checkMid) {
                continue;
            }
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
