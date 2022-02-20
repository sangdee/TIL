package lecture.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/20
 */
public class 효율적인화폐구성 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] dp = new int[10001];
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int money = arr[i];
            for (int j = money; j <= m; j ++) {
                if (dp[j - money] != 10001) {
                    dp[j] = Math.min(dp[j], dp[j - money] + 1);
                }
            }
        }
        System.out.println(dp[m]);

    }
}
