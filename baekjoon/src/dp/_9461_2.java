package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-19
 */
public class _9461_2 {
    public static void main(String[] args) {
        // 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int t = 0; t < testCase; t++) {
            int n = scanner.nextInt();
            long[] d = new long[101];
            d[1] = 1;
            d[2] = 1;
            d[3] = 1;

            for (int i = 4; i <= n; i++) {
                if (d[i] == 0) {
                    d[i] = d[i - 2] + d[i - 3];
                }
            }

            System.out.println(d[n]);
        }
    }
}
