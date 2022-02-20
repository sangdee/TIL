package lecture.dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/20
 */
public class 금광 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt(), m = sc.nextInt();

            int[][] arr = new int[n][m];
            int[][] dp = new int[n][m];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    dp[j][k] = arr[j][k];
                }
            }
            for (int j = 1; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    int leftUp, leftDown, left;
                    if (i == n - 1) {
                        leftDown = 0;
                    } else {
                        leftDown = dp[k + 1][j - 1];
                    }
                    if (i == 0) {
                        leftUp = 0;
                    } else {
                        leftUp = dp[k - 1][j - 1];
                    }

                    left = dp[k][j - 1];

                    dp[k][j] = dp[k][j] + Math.max(leftDown, Math.max(leftUp, left));
                }
            }
            int result = 0;
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dp[j][m - 1]);
            }
            System.out.println(result);

        }
    }

}
