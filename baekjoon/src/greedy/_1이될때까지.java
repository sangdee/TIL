package greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-19
 */
public class _1이될때까지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;

        while (n != 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n--;
            }
            count++;
        }
        System.out.println(count);
    }
}
