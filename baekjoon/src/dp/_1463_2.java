package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-24
 */
public class _1463_2 {
    /**
     * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
     * <p>
     * X가 3으로 나누어 떨어지면, 3으로 나눈다.
     * X가 2로 나누어 떨어지면, 2로 나눈다.
     * 1을 뺀다.
     * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[1000001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            int n1 = i, n2 = i, n3 = i;

            if (i % 3 == 0) n1 = i / 3;
            if (i % 2 == 0) n2 = i / 2;
            n3 = i - 1;

            dp[i] = Math.min(dp[n1], Math.min(dp[n2], dp[n3])) + 1;
        }
        System.out.println(dp[n]);
    }
}
