package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-18
 */
public class _1로만들기_2 {
    public static int[] dp = new int[30001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }
            if (i % 5 == 0) {
                dp[i] = Math.min(dp[i / 5] + 1, dp[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
