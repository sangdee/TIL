package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/31
 */
public class 영화감독숌 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(666);
            return;
        }
        int count = 1;
        int result = 0;
        while (true) {
            count++;
            if (String.valueOf(count).contains("666")) {
                result++;
                if (result == n) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
