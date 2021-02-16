package DP;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-16
 */
public class _2156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];

        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
//            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));

        }
//        int max = 0;
//        for (int i = 1; i <= n; i++) {
//            if (dp[i] > max) {
//                max = dp[i];
//            }
//        }
        System.out.println(dp);
    }
}
