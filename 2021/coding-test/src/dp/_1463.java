package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-15
 */
public class _1463 {
    //    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
    //
    //X가 3으로 나누어 떨어지면, 3으로 나눈다.
    //X가 2로 나누어 떨어지면, 2로 나눈다.
    //1을 뺀다.
    //정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
    // 연산을 사용하는 횟수의 최솟값을 출력하시오.
    public static void main(String[] args) {
        int[] dp = new int[1000001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        int n = new Scanner(System.in).nextInt();

        for (int i = 2; i <= n; i++) {
            int n1 = i, n2 = i, n3 = i;
            if (i % 2 == 0) n1 = i / 2;
            if (i % 3 == 0) n2 = i / 3;
            n3 = i - 1;

            if (n1 == 1 || n2 == 1 || n3 == 1) {
                dp[i] = 1;
            } else {
                dp[i] = Math.min(dp[n1], Math.min(dp[n2], dp[n3])) + 1;
            }
        }

        System.out.println(dp[n]);
    }
    // 1 2 1

}
