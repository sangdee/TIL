package baekjoon.dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/19
 */
public class 피보나치함수 {

    static int[] cache = new int[41];
    static int countOfZero = 0, countOfOne = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 0; i < testCase; i++) {
            countOfZero = 0;
            countOfOne = 0;
            fibonacci(scanner.nextInt());

            System.out.println(countOfZero + " " + countOfOne);
        }
    }

    private static void fibonacci(int n) {
        int zero = 1, one = 1, temp = 0;
        if (n == 0) {
            countOfZero++;
            return;
        }
        if (n == 1) {
            countOfOne++;
            return;
        }
        if (n == 2) {
            countOfOne++;
        }
        for (int i = 2; i < n; i++) {
            temp = zero + one;
            zero = one;
            one = temp;
        }
    }
}
