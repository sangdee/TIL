package programmers.lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/06
 */
public class 피보나치수 {
    int[] dp = new int[100_001];

    public int solution(int n) {
        dp[0] = 0;
        dp[1] = 1;
        return (fibo(n) % 1234567);
    }

    public int fibo(int n) {
        if (n == 0) return 0;
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = (((fibo(n - 2) + fibo(n - 1)) % 1234567));
    }
}
