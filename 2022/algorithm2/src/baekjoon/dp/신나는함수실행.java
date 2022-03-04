package baekjoon.dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/04
 */
public class 신나는함수실행 {
    static int dp[][][] = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
        }
    }

    static public int w(int a, int b, int c) {
        if (a >= 0 && a <= 20 && b >= 0 && c >= 0 && b <= 20 && c <= 20) {
            if (dp[a][b][c] != 0) {
                return dp[a][b][c];
            }
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        } else if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }
}
