package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _1149 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            dp[i][0] = scanner.nextInt();
            dp[i][1] = scanner.nextInt();
            dp[i][2] = scanner.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][1], dp[i - 1][0]);
        }

        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));


    }
}
/*
 *  R G B
 *  n != (n-1)
 *  26 40 83
 *  49 60 57
 *  13 89 99
 *
 * */
