package baekjoon.recursion;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/21
 */
public class 피보나치 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(fibo(i));
    }

    static int fibo(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }

       return fibo(i - 2) + fibo(i - 1);
    }
}
