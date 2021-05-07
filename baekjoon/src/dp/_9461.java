package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _9461 {
    static long[] arr = new long[101];

    public static long sequence(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2 || n == 3) {
            return 1;
        } else {
            if (arr[n] == 0) {
                arr[n] = sequence(n - 2) + sequence(n - 3);
            }
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        long[] result = new long[testCase];
        for (int tc = 0; tc < testCase; tc++) {
            int n = scanner.nextInt();

            result[tc] = sequence(n);
        }
        for (long i : result) {
            System.out.println(i);
        }
        /*
         * 1 1 1 2 2 3 4 5 7 9
         *
         * 1   1
         * 2   1
         * 3   1
         * 4   2
         * 5   2
         * 6   3
         * 7   4
         * 8   5
         * 9   7
         * 10  9
         * f(4) = f(2) + f(1)
         * f(5) = f(3) + f(2)
         * f(6) = f(4) + f(3)
         * f(7) = f(5) + f(4)
         *
         * f(x) = f(x-2) - f(x -3)
         *
         * */
    }
}
