package baekjoon.recursion;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/21
 */
public class 팩토리얼 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(factorial(i));
    }

    static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        int n = 1;
        if (i == 1) {
            return n;
        } else {
            n = i * factorial(i - 1);
        }
        return n;
    }
}
