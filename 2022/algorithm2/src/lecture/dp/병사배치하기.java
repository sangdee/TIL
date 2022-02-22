package lecture.dp;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/20
 */
public class 병사배치하기 {
    //가장 긴 증가하는 부분 수열 (LIS)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n], dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        OptionalInt max = Arrays.stream(dp).max();
        System.out.println(n - max.orElseThrow(NullPointerException::new));

    }
}
