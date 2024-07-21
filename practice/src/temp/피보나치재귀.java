package temp;

public class 피보나치재귀 {
    //1 1 2 3 5 8
    static int[] dp = new int[100];

    public static void main(String[] args) {
        int n = 45;
        for (int i = 1; i <= n; i++) {
            System.out.print(dfs(i) + " ");
        }
    }

    private static int dfs(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            if (dp[n] != 0) {
                return dp[n];
            }
            return dp[n] = dfs(n - 2) + dfs(n - 1);
        }
    }

    private static int f(int n) {
        int num1 = 1, num2 = 1, num3 = 0;
        for (int i = 3; i <= n; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }

        return num3;
    }
}
