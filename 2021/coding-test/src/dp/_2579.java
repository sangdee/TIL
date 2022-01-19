package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _2579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];

        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }
        System.out.println(dp[n]);
    }
    /*
     * 한계단 혹은 두계단
     * n+1 , n+2를 비교
     * 연속된 세 계단을 밟으면 안됨(단 시작점은 포함 안 됨)
     * 단 마지막은 무주건 밟아야 함
     *
     * 10 20 15 25 10 20
     *
     * 10 20 25 20
     *
     * */

}
