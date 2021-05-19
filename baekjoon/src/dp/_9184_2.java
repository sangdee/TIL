package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-19
 */
public class _9184_2 {
    /**
     * if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
     * 1
     * <p>
     * if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
     * w(20, 20, 20)
     * <p>
     * if a < b and b < c, then w(a, b, c) returns:
     * w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
     * <p>
     * otherwise it returns:
     * w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
     */

    static int[][][] d = new int[51][51][51];


    public static int w(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0)
            if (d[a][b][c] != 0) {
                return d[a][b][c];
            }

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return d[a][b][c] = w(20, 20, 20);
        } else if (a < b && b < c) {
            return d[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            return d[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == -1 && b == -1 && c == -1) break;

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
        }
    }
}
