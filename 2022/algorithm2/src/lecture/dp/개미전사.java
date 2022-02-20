package lecture.dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/19
 */
public class 개미전사 {

    public static void main(String[] args) {
        int[] dp = new int[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }

        System.out.println(dp[n - 1]);
    }

}
