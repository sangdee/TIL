package algorithm.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int index = 3; index <= n; index++) {
            dp[index] = dp[index - 1] + dp[index - 2];
        }

        return dp[n];

    }
}
