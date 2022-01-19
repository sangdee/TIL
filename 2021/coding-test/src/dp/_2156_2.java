package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-24
 */
public class _2156_2 {
    /**
     * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
     * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
     * <p>
     * 입력
     * 첫째 줄에 포도주 잔의 개수 n이 주어진다. (1≤n≤10,000) 둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다.
     * 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
     * <p>
     * 출력
     * 첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[1] = arr[1];

        if (n >= 2)
            dp[2] = arr[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }
        System.out.println(dp[n]);
    }
}
