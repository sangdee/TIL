package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-18
 */
public class 개미전사_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];
        dp[2] = Math.max(arr[1], arr[2]);

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }

        System.out.println(dp[n]);
    }
}
