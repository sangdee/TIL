package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-18
 */
public class 금광_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            int[][] arr = new int[n][m];
            int[][] dp = new int[n][m];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = scanner.nextInt();
                    dp[j][k] = arr[j][k];
                }
            }

            for (int j = 1; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    int leftUp, leftDown, left;
                    if (k == 0) {
                        leftUp = 0;
                    } else {
                        leftUp = dp[k - 1][j - 1];
                    }

                    if (k == n - 1) {
                        leftDown = 0;
                    } else {
                        leftDown = dp[k + 1][j - 1];
                    }

                    left = dp[k][j - 1];
                    dp[k][j] = dp[k][j] + Math.max(leftUp, Math.max(leftDown, left));
                }
            }

            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dp[j][m - 1]);
            }
            System.out.println(max);
        }
    }
}
