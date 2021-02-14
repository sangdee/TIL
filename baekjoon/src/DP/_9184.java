package DP;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _9184 {
    static int[][][] dp = new int[21][21][21];

    public static int w(int a, int b, int c) {
        if (0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20) {
            if (dp[a][b][c] != 0) {
                return dp[a][b][c];
            }

        }
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return dp[20][20][20] = w(20, 20, 20);
        if (a < b && b < c) return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == -1 && b == -1 && c == -1) break;

            sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append('\n');
        }
        System.out.println(sb);
    }
}
