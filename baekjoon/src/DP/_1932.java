package DP;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _1932 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n + 2][n + 2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = scanner.nextInt();
            }
        }
        for (int i = n; i > 1; i--) {
            for (int j = 1; j <= n; j++) {
                dp[i - 1][j] += Math.max(dp[i][j], dp[i][j + 1]);
            }
        }
        System.out.println(dp[1][1]);
    }
}
