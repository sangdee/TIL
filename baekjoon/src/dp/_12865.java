package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-18
 */
public class _12865 {
    public static void main(String[] args) {
        int n, k;
        int dp[][], w[], v[]; // dp배열과 무게, 가치배열

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        dp = new int[n + 1][k + 1];

        w = new int[n + 1];
        v = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j]; // 기본적으로 이전 아이템의 가치를 저장한다.
                if (j - w[i] >= 0) { // 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면,
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]); // 이전 아이템에서 구한 가치와 남은 무게의 가치 + 자신의 가치 중 큰 값을 취한다.
                }
            }
        }

        System.out.println(dp[n][k]);


    }
}
