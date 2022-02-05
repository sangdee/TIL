package baekjoon.greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/31
 */
public class 설탕배달 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (true) {
            if (n % 5 == 0) {
                n -= 5;
            } else if (n % 3 == 0) {
                n -= 3;
            } else {
                n -= 5;
            }
            count++;
            if (n == 0) {
                System.out.println(count);
                break;
            } else if (n < 0) {
                System.out.println(-1);
                break;
            }

        }
    }
}
