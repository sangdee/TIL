package codility;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lessonn3 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 2, 1, 2,}, new int[]{1, 3, 4, 4}));
    }

    public static int solution(int N, int[] A, int[] B) {
        int[] dp = new int[N + 1];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            dp[A[i]]++;
            dp[B[i]]++;
        }
        Arrays.sort(dp);
        for (int i = dp.length - 1; i > 0; i--) {
            sum += dp[i] * i;
        }
        return sum;
    }
}
